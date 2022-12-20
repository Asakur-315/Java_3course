import java.text.DecimalFormat;

public class ThirdTask {
    
    public static double count(double a, double b){
        if (b - a <= 0.001) {
            DecimalFormat df = new DecimalFormat("#.####");
            System.out.println("Корень уравнения= " + df.format(a));
            return a;
        }

        double x = a + (b-a)/2;

        if (function(a) * function(x) > 0) {
            return count(x,b);
        } else return count(a, x);
    }

    private static double function(double x){
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23; 
    }
}
