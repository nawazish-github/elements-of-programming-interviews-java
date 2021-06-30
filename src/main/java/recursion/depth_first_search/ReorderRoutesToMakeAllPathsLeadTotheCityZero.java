package recursion.depth_first_search;

import java.util.*;

/**
 * https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/
 * There are n cities numbered from 0 to n-1 and n-1 roads such that there is only one way to travel between two different cities (this network form a tree). Last year, The ministry of transport decided to orient the roads in one direction because they are too narrow.
 *
 * Roads are represented by connections where connections[i] = [a, b] represents a road from city a to b.
 *
 * This year, there will be a big event in the capital (city 0), and many people want to travel to this city.
 *
 * Your task consists of reorienting some roads such that each city can visit the city 0. Return the minimum number of edges changed.
 *
 * It's guaranteed that each city can reach the city 0 after reorder.
 */
public class ReorderRoutesToMakeAllPathsLeadTotheCityZero {
    int result;
    public int minReorder(int n, int[][] connections) {
        Map<Integer, List<Integer>> neighbours = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            neighbours.put (i, new LinkedList<>());
        }
        for (int[] tuple : connections) {
            int src = tuple[0];
            int dest = tuple[1];


            List<Integer>list = neighbours.get(src);
            list.add(dest);
            neighbours.put(src, list);

            List<Integer> list2 = neighbours.get(dest);
            list2.add(src);
            neighbours.put(dest, list2);

            set.add(""+src+","+dest);
        }
        HashSet<Integer> visited = new HashSet<>();
        visited.add(0);
        dfs (0, neighbours, set, n, visited);
        return result;
    }


    private void dfs (int city, Map<Integer, List<Integer>> map, Set<String> set, int maxCities, Set<Integer> visited) {
        List<Integer> neighbours = map.get(city);
        for (int neighbouringCity : neighbours) {
            if (visited.contains(neighbouringCity)) continue;


            //int[] tuple = new int[]{neighbouringCity, city};
            if (!set.contains(""+neighbouringCity+","+city)) {
                result += 1;
            }else{
                System.out.println("Set contains: "+""+city+","+neighbouringCity);
            }
            visited.add(neighbouringCity);
            dfs (neighbouringCity, map, set, maxCities, visited);
        }
    }
}
