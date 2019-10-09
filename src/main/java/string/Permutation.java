package string;

import java.util.ArrayList;

public class Permutation {
    public ArrayList<String> permutate(String string){
        ArrayList<String> results = new ArrayList<>();
        permutate("", string, results);
        return results;
    }

    private void permutate (String prefix, String suffix, ArrayList<String> results){
        if(suffix.length() == 0){
            results.add(prefix);
        }

        for (int i = 0; i < suffix.length(); i++) {
            permutate(prefix+suffix.charAt(i), suffix.substring(0, i)+suffix.substring(i+1), results);
        }

    }
}
