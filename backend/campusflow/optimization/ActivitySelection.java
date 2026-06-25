package backend.campusflow.optimization;

public class ActivitySelection {

    public void selectActivities(int[] start, int[] finish) {

        int n = start.length;

        System.out.println("Selected Activities:");

        int i = 0;
        System.out.println(i);

        for (int j = 1; j < n; j++) {

            if (start[j] >= finish[i]) {

                System.out.println(j);
                i = j;
            }
        }
    }
}