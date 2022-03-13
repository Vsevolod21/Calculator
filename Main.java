package lambda.calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        int m = calc.multiply.apply(3, 2);

        calc.println.accept(c);

//        int p = calc.pow.apply(8);
//        calc.println.accept(p);
//
//        int aa = calc.abs.apply(-8);
//        calc.println.accept(aa);
//
//        System.out.println(calc.isPositive.test(-9));

    }
}
