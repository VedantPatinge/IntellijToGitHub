import java.util.Arrays;

public class MergeArrays  {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        int j = 0;
        for (int i = 0; i < m; i++) {
            if (X[i] == 0) {
                X[i] = Y[j];
                j++;
            }
        }

        Arrays.sort(X);
    }
}
