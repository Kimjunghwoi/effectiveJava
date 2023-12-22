package prac.effectivejava.etc.functional;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * 매개값은 있고, 반환값은 없다.
 * 매개값을 전달받아 사용하고 아무것도 반환하지 않을 때 사용된다.
 * 이를 소비 (Consume) 한다고 표현한다.
 * accept 추상 메소드를 가지고 있다.
 *
**/
public class ConsumerEx {

    public static void main(String[] args) {

        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());

        consumer.accept("hello world");


        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        numbers.forEach(System.out::println);
//        numbers.forEach(System.out::println);

        Map<String, Integer> map = Map.of("man", 25, "woman", 20);
        map.forEach((name, number) -> System.out.println(name + "는" + number + "살"));


        // 대표적인 컨슈머... 표현식 내부에서 사용될 뿐 아무것도 반환하지 않는다.

        List<String> fruits = Arrays.asList("apple", "kiwi", "orange");

        Consumer<List<String>> addNumber = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, (i + 1) + ". " + list.get(i));
            }
        };

        Consumer<List<String>> printList = list -> {
            for (String fruit : list) {
                System.out.println(fruit);
            }
        };

        addNumber.andThen(printList).accept(fruits);

    }


}
