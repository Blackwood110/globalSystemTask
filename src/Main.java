public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {5, 2, 4, 6, 1, 3, 2, 6};
        MergeSort.sort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
