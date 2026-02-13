package Homeworks.Homework_9;

public class Distances {

    public static double calculateDistance(double x1, double y1,
                                           double x2, double y2) {

        double dx = x2 - x1;
        double dy = y2 - y1;

        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {

        double homeX = 0;
        double homeY = 0;

        System.out.println("Distance from home to:");

        String[] places = {
                "school",
                "shop",
                "park",
                "friend",
                "cinema",
                "grandmother"
        };

        double[][] coordinates = {
                {4, 3},
                {0, 8},
                {5, 12},
                {9, 0},
                {2, 10},
                {7, 5}
        };

        double minDistance = Double.MAX_VALUE;
        double maxDistance = 0;

        String closestPlace = "";
        String farthestPlace = "";

        for (int i = 0; i < coordinates.length; i++) {

            double distance = calculateDistance(homeX, homeY,
                    coordinates[i][0], coordinates[i][1]);

            System.out.println(places[i] + " → " + distance + " meters");

            if (distance < minDistance) {
                minDistance = distance;
                closestPlace = places[i];
            }

            if (distance > maxDistance) {
                maxDistance = distance;
                farthestPlace = places[i];
            }
        }

        System.out.println("Closest place: " + closestPlace +
                " (" + minDistance + " meters)");

        System.out.println("Farthest place: " + farthestPlace +
                " (" + maxDistance + " meters)");
    }
}
