package codility.interviews;

import java.util.HashSet;

// Find number of points in Cartesian coordinates with the same polar angle
public class PointsOnOneRay {
    public static class Point2D {
        int x;
        int y;

        public Point2D(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int solution(Point2D[] A) {
        HashSet<Double> set = new HashSet<>();

        for (Point2D p : A) {
            set.add(Math.atan2(p.y, p.x));
        }
        return set.size();
    }
}
