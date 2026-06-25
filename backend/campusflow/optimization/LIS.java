package backend.campusflow.optimization;

public class LIS {

    public int findLIS(int[] arr) {

        int n = arr.length;
        int[] lis = new int[n];

        for (int i = 0; i < n; i++)
            lis[i] = 1;

        for (int i = 1; i < n; i++) {

            for (int j = 0; j < i; j++) {

                if (arr[i] > arr[j]
                        && lis[i] < lis[j] + 1)

                    lis[i] = lis[j] + 1;
            }
        }

        int max = 0;

        for (int value : lis)
            max = Math.max(max, value);

        return max;
    }
}