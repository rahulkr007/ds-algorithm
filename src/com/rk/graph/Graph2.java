package com.rk.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph2 {

	private LinkedList<Integer> adj[];

	public Graph2(int vertices) {
		adj = new LinkedList[vertices];
		for (int i = 0; i < vertices; i++) {
			adj[i] = new LinkedList<>();
		}
	}

	public void addEdge(int source, int destination) {
		adj[source].add(destination);
	}

	public int bfs(int source, int destination) {
		Queue<Integer> queue = new LinkedList<>();
		int parent[] = new int[adj.length];
		parent[source] = -1;
		int distance = 0;
		boolean vis[] = new boolean[adj.length];
		vis[source] = true;
		queue.add(source);
		while (!queue.isEmpty()) {
			int cur = queue.poll();
			if (cur == destination) {
				break;
			}
			for (int neighbour : adj[cur]) {
				if (!vis[neighbour]) {
					queue.add(neighbour);
					parent[neighbour] = cur;
					vis[neighbour] = true;
				}
			}
		}
		int cur = destination;
		while (parent[cur] != -1) {
			distance++;
			cur = parent[cur];
		}
		return distance;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vertices and edges : ");
		int vertex = sc.nextInt();
		int edge = sc.nextInt();
		Graph2 graph = new Graph2(vertex);
		System.out.println("Enter " + edge + " vertices information : ");
		for (int i = 0; i < edge; i++) {
			graph.addEdge(sc.nextInt(), sc.nextInt());
		}
		System.out.println("Enter source and destination to get the shortest path : ");
		int source = sc.nextInt();
		int destination = sc.nextInt();
		System.out.println(graph.bfs(source, destination));
	}
}
