public class SinCos {
    // Exercise from http://pentangle.net/python/handbook/node33.html, i.e.
    // Populate arrays with sin and cos in range 0 to 2π, and print dot product

    public static void main(String[] args) {
        int N = 100;
        double arg = 0;
        double dot = 0;
        double[] x = new double[100];
        double[] y = new double[100];

        /* Populate x and y */
        for (int i = 0; i < N; i++) {
            arg = 2 * Math.PI * i / N;
            x[i] = Math.sin(arg);
            y[i] = Math.cos(arg);
            dot += x[i] * y[i];
        }

        System.out.println("Dot product of sin and cos in range (0, 2π) = " + dot);
    }
}
