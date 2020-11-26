package recursion.divideandconnquer;

public class CountUniqueBSTs {

    public int countUniqueBSTs(int N){
        return countBSTs(N);
    }

    private int countBSTs (int N){
        if (N <= 1) return 1;
        int count = 0;
        for (int i = 0; i < N; i++) {
             count += countBSTs(i) * countBSTs(N-i-1);
        }
        return count;
    }
}
