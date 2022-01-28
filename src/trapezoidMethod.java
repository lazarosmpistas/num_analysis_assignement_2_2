public class trapezoidMethod {

    public static double trapezoidMethodSineIntegralResult(double[] x, int N) {
        double result = 0;
        double a = x[0], b = x[N];
        result += a + b;
        for (int i = 1; i < N; i++) {
            result += 2 * Math.sin(x[i]);
        }
        result = result * ((b - a) / (2 * N));
        return result;
    }
}
