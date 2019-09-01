package recursion;

public class GetSizeOfArray {
    public int getSizeOfArray(int[] array, int index){
        if (index == array.length)
            return 0;
        return 1+getSizeOfArray(array, ++index);
    }
}
