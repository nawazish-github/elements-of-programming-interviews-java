package recursion.top_down;

public class RecursiveTokenizer {

    public void recursiveTokenizer(String input){
        if(input.isEmpty() || input == null){
            return;
        }
        input = input.trim();
        int spaceIdx = input.indexOf(' ');
        String token = null;
        if(spaceIdx > -1) token = input.substring(0, spaceIdx);
        if (token != null) System.out.println(token);
        else System.out.println(input);

        if(spaceIdx > -1) recursiveTokenizer(input.substring(spaceIdx+1));
    }
}
