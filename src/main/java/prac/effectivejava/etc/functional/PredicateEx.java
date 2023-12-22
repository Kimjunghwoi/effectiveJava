package prac.effectivejava.etc.functional;


import java.util.List;
import java.util.function.Predicate;

/**
 * 매개값은 있고, 반환 타입은 boolean 이다.
 * 매개값을 받아 검사하고 true 혹은 false 를 반환할 때 사용된다.
 * test 추상 메소드를 가지고 있다.
 */
public class PredicateEx {

    public static void main(String[] args) {


        Predicate<Integer> predicate = (num) -> num > 10;

        boolean result = predicate.test(100);

        System.out.println("result = " + result);


        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
        boolean allMatched = numbers.stream()
                .allMatch(number -> number > 5);
        System.out.println("allMatched = " + allMatched);
    }

}
