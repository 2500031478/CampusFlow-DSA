package backend.campusflow.services;

public class NavigationService {

    public void findRoute(String source,
                          String destination) {

        System.out.println(
            "Finding shortest route from "
            + source +
            " to " +
            destination
        );
    }
}