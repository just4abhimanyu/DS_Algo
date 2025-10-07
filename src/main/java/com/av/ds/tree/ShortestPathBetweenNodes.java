package com.av.ds.tree;

import java.util.*;

public class ShortestPathBetweenNodes {

    private static Map<String, List<String>> treeData = new TreeMap<>();
    public ShortestPathBetweenNodes() {
        treeData.put("King's Cross St Pancras", Arrays.asList("Angel", "Russell Square", "Farringdon"));
        treeData.put("Angel", Arrays.asList("King's Cross St Pancras", "Old Street"));
        treeData.put("Old Street", List.of("Angel"));
        treeData.put("Russell Square", Arrays.asList("King's Cross St Pancras", "Holborn", "Farringdon"));
        treeData.put("Farringdon", Arrays.asList("King's Cross St Pancras", "Russell Square", "Barbican"));
        treeData.put("Barbican", Arrays.asList("Farringdon", "Moorgate"));
        treeData.put("Moorgate", List.of("Barbican"));
        treeData.put("Holborn", Arrays.asList("Russell Square", "Chancery Lane"));
        treeData.put("Chancery Lane", Arrays.asList("Holborn", "St Paul's"));
        treeData.put("St Paul's", Arrays.asList("Chancery Lane", "Bank"));
        treeData.put("Bank", List.of("St Paul's"));
    }
    public List<String> shortestPath(String from, String to) {

        // Queue to hold stations for BFS traversal (FIFO)
        Queue<String> queue = new LinkedList<>();

        // Map to track the parent of each station for path reconstruction
        Map<String, String> parent = new TreeMap<>();

        // Set to keep track of visited stations to avoid revisiting
        Set<String> visited = new HashSet<>();

        // Start BFS from the 'from' station
        queue.add(from);
        visited.add(from);

        // Continue BFS until there are no more stations to explore
        while (!queue.isEmpty()) {
            // Take the first station from the queue
            String currentNode = queue.poll();

            // Check if we have reached the destination station
            if (currentNode.equals(to)) {

                // Reconstruct the shortest path using the parent map
                List<String> path = new ArrayList<>();
                while (currentNode != null) {
                    path.add(currentNode);               // Add current station to path
                    currentNode = parent.get(currentNode); // Move to parent station
                }
                Collections.reverse(path); // Reverse path because we built it backwards
                return path;               // Return the shortest path
            }

            // Explore all neighbors of the current station
            for (String neighbor : treeData.getOrDefault(currentNode, Collections.emptyList())) {

                // If neighbor is not visited, add it to the queue
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);        // Add neighbor to BFS queue
                    visited.add(neighbor);      // Mark neighbor as visited
                    parent.put(neighbor, currentNode); // Track how we reached this neighbor
                }
            }
        }

        // If BFS completes without finding the destination, return empty list
        return List.of();
    }


    public static void main(String[] args) {
        ShortestPathBetweenNodes tm = new ShortestPathBetweenNodes();
        System.out.println(tm.shortestPath("King's Cross St Pancras", "Bank"));
    }


}
