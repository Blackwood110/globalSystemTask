public class MergeSort {
    public static void sort(int[] a, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            sort(a, p, q);
            sort(a, q + 1, r);
            merge(a, p, q, r);
        }
    }

    private static void merge(int[] array, int left, int middle, int right) {
        int lengthLeft = middle - left + 1;
        int[] leftArraySide = new int[lengthLeft];
        for (int i = 0; i < lengthLeft; i++) {
            leftArraySide[i] = array[left + i];
        }

        int lengthRight = right - middle;
        int[] rightArraySide = new int[lengthRight];
        for (int i = 0; i < lengthRight; i++) {
            rightArraySide[i] = array[middle + i + 1];
        }

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = left; i < right + 1; i++) {
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArraySide[leftIndex] < rightArraySide[rightIndex]) {
                    array[i] = leftArraySide[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArraySide[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < lengthLeft) {
                while (leftIndex < lengthLeft) {
                    array[i] = leftArraySide[leftIndex];
                    i++;
                    leftIndex++;
                }
            } else {
                while (rightIndex < lengthRight) {
                    array[i] = rightArraySide[rightIndex];
                    i++;
                    rightIndex++;
                }
            }
        }
    }
}
