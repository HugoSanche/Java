public class GoalSeek {

    // Define the function f(x) = x * 50 - 10000
    public static double function(double x) {
        return x * 50 - 10000;
    }

    // Bisection method to approximate the root
    public static double goalSeek(double lower, double upper, double tolerance) {
        double mid = 0;

        // Check if signs are opposite (required for bisection method)
        if (function(lower) * function(upper) >= 0) {
            throw new IllegalArgumentException("Function must have opposite signs at bounds.");
        }

        while ((upper - lower) >= tolerance) {
            mid = (lower + upper) / 2;
            double fMid = function(mid);

            if (Math.abs(fMid) < tolerance) {
                return mid; // Close enough
            } else if (function(lower) * fMid < 0) {
                upper = mid;
            } else {
                lower = mid;
            }
        }

        return mid;
    }

    public static void main(String[] args) {
        double result = goalSeek(0, 8939.5847512308, 0.0001);
        System.out.println("Solution x = " + result);
        System.out.println("Check: f(x) = " + function(result));
    }
}

