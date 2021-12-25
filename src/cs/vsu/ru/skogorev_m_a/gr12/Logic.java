package cs.vsu.ru.skogorev_m_a.gr12;

public class Logic {
    public static int findSequence(int[] array, int n) {
        if (n > array.length) {
            return -1;
        }
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += array[i];
        }
        int maxSum = currSum;
        int firstElem = 0;
        for (int i = n; i < array.length; i++) {
            currSum = currSum - array[i - n] + array[i];
            if (currSum >= maxSum) {
                firstElem = i - n + 1;
                maxSum = currSum;
            }
        }
        return firstElem;
    }
}
