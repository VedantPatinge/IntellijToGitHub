public class MaximumSumPath  {
    public static int maxSumPath(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        int i = 0, j = 0;
        int sumX = 0, sumY = 0, result = 0;

        while (i < m && j < n) {
            if (X[i] < Y[j])
                sumX += X[i++];
            else if (X[i] > Y[j])
                sumY += Y[j++];
            else {
                result += Math.max(sumX, sumY);
                result += X[i];
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            }
        }

        while (i < m)
            sumX += X[i++];

        while (j < n)
            sumY += Y[j++];

        result += Math.max(sumX, sumY);
        return result;
    }

}
