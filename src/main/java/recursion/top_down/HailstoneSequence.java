package recursion.top_down;

public class HailstoneSequence {
    public void hailStoneSequence(int input){
        if (input == 1){
            return;
        }

        if (input % 2 == 0){
            int half = input / 2;
            System.out.println(half);
            hailStoneSequence(half);
        }else{
            int threeTimes = (3*input) + 1;
            System.out.println(threeTimes);
            hailStoneSequence(threeTimes);
        }
    }
}
