package recursion;

public class Sum {

    public int sum(int[] arr, int i){
        if(arr.length == i) return 0;
        int s = sum(arr, i+1);
        return s+arr[i];
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        int s = sum.sum(new int[]{1, 2, 3}, 0);
        System.out.println(s);
    }
}
