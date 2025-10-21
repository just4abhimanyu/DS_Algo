package com.av.ds.graph.dfs;

import java.util.*;

public class DFSAlgo {
    private Map<String, List<String>> map = new HashMap<>();

    public DFSAlgo() {
        map.put("King's Cross St Pancras", Arrays.asList("Angel", "Russell Square", "Farringdon"));
        map.put("Angel", Arrays.asList("King's Cross St Pancras", "Old Street"));
        map.put("Old Street", Arrays.asList("Angel"));
        map.put("Russell Square", Arrays.asList("King's Cross St Pancras", "Holborn", "Farringdon"));
        map.put("Farringdon", Arrays.asList("King's Cross St Pancras", "Russell Square", "Barbican"));
        map.put("Barbican", Arrays.asList("Farringdon", "Moorgate"));
        map.put("Moorgate", Arrays.asList("Barbican"));
        map.put("Holborn", Arrays.asList("Russell Square", "Chancery Lane"));
        map.put("Chancery Lane", Arrays.asList("Holborn", "St Paul's"));
        map.put("St Paul's", Arrays.asList("Chancery Lane", "Bank"));
        map.put("Bank", Arrays.asList("St Paul's"));
    }
    private void dfs(String startNodeEle){
        Stack<String> stack = new Stack<>();
        Set<String> visited = new HashSet<>();
        stack.add(startNodeEle);

        while (!stack.isEmpty()){

            String current = stack.pop();

            if(!visited.contains(current)){
                System.out.println("Visiting: " + current);
                visited.add(current);

                for (String childNode : map.getOrDefault(current, Collections.emptyList())){
                    if(!visited.contains(childNode)){
                        stack.push(childNode);
                    }
                }
            }
        }

    }
    public static void main(String[] args) {
        DFSAlgo mapDFS = new DFSAlgo();
        mapDFS.dfs("Farringdon");
    }
}
