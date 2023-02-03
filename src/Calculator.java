public interface Calculator {

    Supplier<Calculator> instance = Calculator::get;  // -> ошибка, наверное, была здесь. убрала static и добавила вместо new - get
// так как new - это создание объекта, а get - это ссылка на метод

    static Calculator get() {
        return null;
    }

    BinaryOperator<Integer> plus = Integer::sum;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;

}
