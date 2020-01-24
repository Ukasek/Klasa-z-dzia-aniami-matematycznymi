public class Methods {

    boolean isEven(int a) {
        boolean checkNumbEven = a % 2 == 0;
        return checkNumbEven;

    }

    boolean isOdd(int a) {
        boolean checkNumbNotEven = a % 2 != 0;
        return checkNumbNotEven;
    }

    double circleField(double a) {
        double ray = (a * a) * 3.14;
        return ray;
    }

    int power(int a) {
        int sqrtNumber = a * a;
        return sqrtNumber;
    }
}
