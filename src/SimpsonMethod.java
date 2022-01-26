public class SimpsonMethod {

    public static double SimpsonMethodSineResult(double[] x, int N) {
        double result = 0;
        result += Math.sin(x[0]) + Math.sin(x[N]);
        for (int i = 1; i <= (N/2) - 1; i++) {
            result += 2*Math.sin(x[2*i]);
        }
        for (int i = 1; i <= N/2; i++) {
            result += 4*Math.sin(x[(2*i) - 1]);
        }
        return result;
    }
}
