package scratch;

public class Main2 {
    public static void main(String[] args) {
        //System.out.println(6/);
        //System.out.println(answer1(1, 1000000000));
        //System.out.println(answer1(1, 1000000000));
        //System.out.println(answer1(20, 20));
        //System.out.println(answer1(21, 29));
        //System.out.println(4%10);
        //System.out.println(Integer.MAX_VALUE);
        //System.out.println(Integer.MAX_VALUE+1);
        String from = "benyam";
        String to = "ephrem";

        System.out.println(from.charAt(0));
    }

    /*private static int answer1 (int lower, int upper){
        int count = 0;

        if (lower == upper){
            for (int i = 1; i<lower; i++){
                if (lower == i*(i+1)){
                    count++;
                }
            }
            return count;
        }

        for (int i = lower; i<=upper; i++){
            for (int j = 1; j<i; j++){
                if (i == j*(j+1)){
                    count++;
                }
            }
        }
        return count;
    }*/

    private static int answer1 (int A, int B){
        int count = 0;
        for (int i=A; i <= B; i++){
            int root = (int)Math.sqrt(i);
            if (root* (root+1)==i){
                count++;
            }
        }
        return count;
    }
}
