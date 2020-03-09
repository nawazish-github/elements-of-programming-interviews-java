package miscinterviews;

/**
 * Given a positive integer N, find and return the longest distance between two consecutive 1's in the binary representation of N.
 * If there aren't two consecutive 1's, return 0.
 *
 * Input: 22
 * Output: 2
 * Explanation:
 * 22 in binary is 0b10110.
 * In the binary representation of 22, there are three ones, and two consecutive pairs of 1's.
 * The first consecutive pair of 1's have distance 2.
 * The second consecutive pair of 1's have distance 1.
 * The answer is the largest of these two distances, which is 2.
 */
class Binarygap {
    public int solution(int N) {
        // write your code in Java SE 8
        String binaryFormat = convertToBinary(N);

        if(!binaryFormat.contains("1"))
            return 0;

        if(!binaryFormat.contains("0"))
            return 0;

        char[] bits = binaryFormat.toCharArray();

        boolean start = false;
        boolean end = false;
        int gap = 0;
        int res = 0;

        for(char bit : bits){
            if(bit == '0' && start == false)
                continue;

            if(bit == '0' && start == true)
                gap = gap + 1;

            if(bit == '1' && start != true){
                start = true;
                continue;
            }

            if(bit == '1' && start == true){
                if(gap > res)
                    res = gap;
                gap = 0;
            }
        }

        return res;
    }

    private String convertToBinary(int n){
        String x = "";
        while(n > 0) {
            int a = n % 2;
            x = a + x;
            n = n / 2;
        }
        return x;
    }

    public static void main(String[] args) {
        Binarygap solution = new Binarygap();
        System.out.println(solution.solution(1041));;
    }
}
