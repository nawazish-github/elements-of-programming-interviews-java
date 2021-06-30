package recursion.permutation.topdown;

import java.util.LinkedList;
import java.util.List;

public class ArrayOfArrays {

    public List<List<Integer>> arrayOfArrays(List<List<Integer>> input){
        LinkedList<List<Integer>> result = new LinkedList<>();
        LinkedList<Integer> path = new LinkedList<>();
        //List<List<Integer>> available = Arrays.asList(arr);

        arrayOfArrays(input, path, result);
        return result;
    }

    private void arrayOfArrays(List<List<Integer>> available, List<Integer> path, List<List<Integer>> result){

        //base condition?
        if(available.size() == 0){
            result.add(new LinkedList<Integer>(path));
            return;
        }

        for (List<Integer> list : available.toArray(new LinkedList[]{})){
            available.remove(list);

            for(Integer i : list.toArray(new Integer[]{})){
                list.remove(i);
                path.add(i);

                //something should happen here after which
                arrayOfArrays(available, path, result);

                list.add(i);
                path.remove(i);
            }
            available.add(list);
        }
    }
}
