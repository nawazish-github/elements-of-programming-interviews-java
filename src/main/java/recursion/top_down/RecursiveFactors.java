package recursion.top_down;

public class RecursiveFactors {

    public void recursiveFactors(int input){
        recursiveFactors(input, input - 1);
    }

    private void recursiveFactors(int input, int num) {
        if(num < 2){
            return;
        }
        if (input % num == 0) System.out.println(num);
        recursiveFactors(input, num - 1);
    }
}
