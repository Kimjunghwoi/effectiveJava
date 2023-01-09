package prac.effectivejava.etc.functional;

import java.util.List;

/**
 * Function 과 마찬가지로, 매개값도 있고, 반환값도 있다.
 * 주로 매개값을 연산 (Operation) 하여 결과를 반환할 때 사용된다.
 * Function 과 마찬가지로 applyXXX 추상 메소드를 가지고 있다.
 */
public class OperatorEx {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        Integer sum = numbers.stream()
                .reduce(Integer::sum)
                .get();

        System.out.println("sum = " + sum);

    }
}
