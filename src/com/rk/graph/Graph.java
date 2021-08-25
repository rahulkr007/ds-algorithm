package com.rk.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Graph {
	private List<Integer> adj[];

	public Graph(int v) {
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}

	public int bfs(int source, int destination) {
		boolean vis[] = new boolean[adj.length];
		int parent[] = new int[adj.length];
		Queue<Integer> q = new LinkedList<>();
		q.add(source);
		parent[source] = -1;
		vis[source] = true;
		while (!q.isEmpty()) {
			int cur = q.poll();
			if (cur == destination) {
				break;
			}

			for (int neighbour : adj[cur]) {
				if (!vis[neighbour]) {
					vis[neighbour] = true;
					q.add(neighbour);
					parent[neighbour] = cur;

				}
			}
		}
		int cur = destination;
		int distance = 0;
		while (parent[cur] != -1) {
			System.out.print(cur + " -> ");
			cur = parent[cur];
			distance++;
		}
		return distance;

	}

	private boolean dfsUtil(int source, int destination, boolean vis[]) {
		if (source == destination)
			return true;
		for (int neighbour : adj[source]) {
			if (!vis[neighbour]) {
				vis[neighbour] = true;
				boolean isConnected = dfsUtil(neighbour, destination, vis);
				if (isConnected)
					return true;
			}
		}
		return false;
	}

	public boolean dfsStack(int source, int destination) {
		boolean vis[] = new boolean[adj.length];
		vis[source] = true;
		Stack<Integer> stack = new Stack();
		stack.push(source);
		while (!stack.isEmpty()) {
			int cur = stack.pop();
			if (cur == destination) {
				return true;
			}
			for (int neighbour : adj[cur]) {
				if (!vis[neighbour]) {
					vis[neighbour] = true;
					stack.push(neighbour);
				}
			}
		}

		return false;
	}

	public boolean dfs(int source, int destination) {
		boolean vis[] = new boolean[adj.length];
		vis[source] = true;
		return dfsUtil(source, destination, vis);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of vertices and edges");
		int v = sc.nextInt();
		int e = sc.nextInt();
		Graph graph = new Graph(v);
		System.out.println("Enter " + e + " edges");
		for (int i = 0; i < e; i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			graph.addEdge(source, destination);
		}
		System.out.println("Enter source and destination");
		int source = sc.nextInt();
		int destination = sc.nextInt();
//		System.out.println("min distance is " + graph.bfs(source, destination));
		System.out.println("Connection possible : " + graph.dfsStack(source, destination));
	}

}
