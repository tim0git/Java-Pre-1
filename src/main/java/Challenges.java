import java.math.BigDecimal;
import java.math.RoundingMode;

public class Challenges {
    public static double modulo(double a, double b){
        return a % b;
    }
    public static int squareRoot(int n){
        return (int) Math.sqrt(n);
    }
    public static double raiseToPower(int value, int power) {
        return  Math.pow(value, power);
    }

    public static String formatMoney(double money) {
        return "£" + money;
    }

    public static double calculateCircleArea(int radius) {
        double radiusSquare = Math.pow(radius, 2.00);
        double area = Math.PI * radiusSquare;
        BigDecimal areaToThreeSignificantFigures = new BigDecimal(area).setScale(3, RoundingMode.HALF_UP);
        return areaToThreeSignificantFigures.doubleValue();
    }
}
