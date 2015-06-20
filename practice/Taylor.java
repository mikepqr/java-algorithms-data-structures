import java.util.Scanner;

public class Taylor {

    public static double taylor(double x, int n) {
        double sum = 1;
        double term = 1;

        for (int i = 1; i < n; i++) {
            term = term * x/i;
            sum += term;
        }

        return sum;
    }

    public static void main(String[] args) {
        // Exercise from http://pentangle.net/python/handbook/node36.html, i.e.
        // print a table of e^x using Taylor.taylor() and Math.exp()

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of terms in Taylor expansion: ");
        int n = in.nextInt();

        int N = 10;
        double[] x = new double[11];
        for (int i = 0; i <= N; i++) {
            x[i] = (double) i/N;
        }

        for(double xi : x) {
            double approx = taylor(xi, n);
            double exact = Math.exp(xi);
            System.out.println(xi
                    + " " + approx
                    + " " + exact
                    + " " + (exact - approx));
                 
        }
    }
}
