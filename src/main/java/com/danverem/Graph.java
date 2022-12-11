package com.danverem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph {

    // Function to find the shortest path between two nodes
    public static List<String> findShortestPath(Map<String, List<String>> graph, String start, String end) {
        // Create a map to store the distances of each node from the start node
        Map<String, Integer> distances = new HashMap<>();
        distances.put(start, 0);

        // Create a map to store the previous node in the shortest path
        Map<String, String> previous = new HashMap<>();

        // Create a set to store the unvisited nodes
        Set<String> unvisited = new HashSet<>(graph.keySet());

        // While there are unvisited nodes
        while (!unvisited.isEmpty()) {
            // Find the unvisited node with the smallest distance from the start node
            String current = null;
            int currentDistance = Integer.MAX_VALUE;
            for (String node : unvisited) {
                if (distances.get(node) != null && distances.get(node) < currentDistance) {
                    current = node;
                    currentDistance = distances.get(node);
                }
            }

            // If the current node is the end node, we have found the shortest path
            if (current.equals(end)) {
                break;
            }

            // Remove the current node from the unvisited set
            unvisited.remove(current);

            // Update the distances of the unvisited neighbors of the current node
            for (String neighbor : graph.get(current)) {
                int newDistance = distances.get(current) + 1;  // The distance between two nodes is always 1
                if (!distances.containsKey(neighbor) || newDistance < distances.get(neighbor)) {
                    distances.put(neighbor, newDistance);
                    previous.put(neighbor, current);
                }
            }
        }

        // If the end node is not reachable from the start node, return null
        if (!distances.containsKey(end)) {
            return null;
        }

        // Otherwise, construct the shortest path by starting at the end node and following the previous nodes
        LinkedList<String> path = new LinkedList<>();
        String current = end;
        while (current != null) {
            path.addFirst(current);
            current = previous.get(current);
        }

        return path;
    }

    public static void main(String[] args) {
        // Example usage
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B","D"));
        graph.put("B", List.of("C"));
        graph.put("C",List.of("A","D"));
        graph.put("D", List.of("B"));

        List<String> shortestPath = findShortestPath(graph, "A", "C");
        System.out.println(shortestPath);
    }

}
