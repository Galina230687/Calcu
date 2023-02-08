class Main {


    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();


        int a = calc.plus.apply(4, 2);
        int b = calc.minus.apply(8, 0);
        int d = calc.multiply.apply(a, b);
        int c = calc.devide.apply(a, b);
        int e = calc.pow.apply(b);
        int f = calc.abs.apply(a);
        boolean g = calc.isPositive.test(a);


        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(d);
        calc.println.accept(c);
        calc.println.accept(e);
        calc.println.accept(f);
        System.out.println(g);

    }

}