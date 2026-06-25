package backend.campusflow.services;

public class AnalyticsService {

    public double calculateUsage(int used, int total) {

        if (total == 0)
            return 0;

        return ((double) used / total) * 100;
    }

    public void displayUsage(int used, int total) {

        System.out.println(
            "Usage Percentage: "
            + calculateUsage(used, total)
            + "%"
        );
    }
}