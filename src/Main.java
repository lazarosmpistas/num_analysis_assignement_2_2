public class Main {


    public static void main(String[] args) {
        int N = 10;
        double a = 0, b = Math.PI / 2;
        double[] x= new double[N+1];
        x[0] = a;
        for(int i = 1; i <= N; i++) {
            x[i] = x[0] + i*(b-a)/N;
        }
        double simpsonMethodResult = SimpsonMethod.SimpsonMethodSineIntegralResult(x, N);
        System.out.println("FOR SIMPSON METHOD:\nSTART: " + a + "\nEND: " + b + "\nRESULT: " + simpsonMethodResult);

        System.out.println();

        double trapezoidMethodResult = trapezoidMethod.trapezoidMethodSineIntegralResult(x, N);
        System.out.println("FOR TRAPEZOID METHOD:\nSTART: " + a + "\nEND: " + b + "\nRESULT: " + trapezoidMethodResult);
    }

}
