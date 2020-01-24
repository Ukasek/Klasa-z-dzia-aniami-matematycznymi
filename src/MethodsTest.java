public class MethodsTest {
    public static void main(String[] args) {

        Methods evenOr = new Methods();
        boolean resultEvenOr = evenOr.isEven(68);
        System.out.println(resultEvenOr);

        Methods notEvenOr = new Methods();
        boolean resultNotEvenOr = notEvenOr.isOdd(6);
        System.out.println(resultNotEvenOr);

        Methods ray = new Methods();
        double resultCircleField = ray.circleField(5);
        System.out.println(resultCircleField);

        Methods sqrtNumb = new Methods();
        int resultSqrtNumb = sqrtNumb.power(8);
        System.out.println(resultSqrtNumb);


    }
}
