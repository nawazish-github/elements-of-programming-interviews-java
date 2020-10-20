package array;

public class CanBalance {
    public boolean canBalance(int[] arr){
        if (arr.length == 0) return true; //empty array is always balanced.
        int firstHalf = 0;
        int secondHalf = 0;

        for (int i = 0; i < arr.length; i++) {
            secondHalf += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            firstHalf += arr[i];
            secondHalf -= arr[i];

            if(firstHalf == secondHalf)
                return true;
        }
        return false;
    }
}
