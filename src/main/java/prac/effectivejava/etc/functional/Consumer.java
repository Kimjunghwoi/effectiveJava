package prac.effectivejava.etc.functional;


import java.util.List;
import java.util.Map;

/**
 * 매개값은 있고, 반환값은 없다.
 * 매개값을 전달받아 사용하고 아무것도 반환하지 않을 때 사용된다.
 * 이를 소비 (Consume) 한다고 표현한다.
 * accept 추상 메소드를 가지고 있다.
 *
**/
public class Consumer {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        numbers.stream().forEach(number -> System.out.println(number));
//        numbers.forEach(System.out::println);

        Map<String, Integer> map = Map.of("man", 25, "woman", 20);
        map.forEach((name, number) -> System.out.println(name + "는" + number + "살"));

        // 대표적인 컨슈머... 표현식 내부에서 사용될 뿐 아무것도 반환하지 않는다.

    }


}
