import java.util.Arrays;

public static void main(String[] args) {
    int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
    int[] Y = {1, 8, 9, 10, 15};

    MergeArrays.mergeArrays(X, Y);

    System.out.println("Merged array: " + Arrays.toString(X));
}
