package prac.effectivejava.etc.functional;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * Function 과 마찬가지로, 매개값도 있고, 반환값도 있다.
 * 주로 매개값을 연산 (Operation) 하여 결과를 반환할 때 사용된다.
 * Function 과 마찬가지로 applyXXX 추상 메소드를 가지고 있다.
 */
public class OperatorEx {
    public static void main(String[] args) {

        UnaryOperator<Integer> unaryOperator1 = n -> n * n;
        Integer result = unaryOperator1.apply(10);
        System.out.println(result);


        UnaryOperator<Integer> func1 = n -> n * 2;
        UnaryOperator<Integer> func2 = n -> n * 3;

        Integer result2 = func1.andThen(func2).apply(10);

        System.out.println(result2);

        BinaryOperator<Integer> binaryOperator = Integer::sum;

        Integer sum = binaryOperator.apply(10, 100);

        System.out.println(sum);



        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        Integer sums = numbers.stream()
                .reduce(Integer::sum)
                .get();

        System.out.println("sums = " + sums);
    }
}
