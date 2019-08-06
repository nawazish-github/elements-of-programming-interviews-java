package array;

import java.util.HashMap;

public class SingleCycleCheck {
    public boolean hasSingleCycle(int[] array) {
        int currentIndex = 0;
        for (int i = 0; i< array.length; i++){
            if (i > 0 && currentIndex == 0)
                return false;
            currentIndex = getNextIndex(currentIndex, array);
        }
        return currentIndex == 0;
    }

    private int getNextIndex(int currentIndex, int[] array) {
        int jump = array[currentIndex];
        int nextIndex = (jump+currentIndex) % array.length;

        return nextIndex>=0?nextIndex:array.length+nextIndex;
    }
}
