package prac.effectivejava.etc.functional;


import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * 매개값은 없고, 반환값은 있다.
 * 실행 후 호출한 곳으로 데이터를 공급 (Supply) 한다.
 * getXXX 추상 메소드를 가지고 있다.
 */
public class SupplierEx {

    public static void main(String[] args) {

        //로또번호 생성기..?
        Stream.generate(() -> new Random().nextInt(45))
                .limit(6)
                .sorted()
                .forEach(System.out::println);

        Supplier<String> supplier = () -> "hello";

        String result = supplier.get();

        System.out.println("result = " + result);
    }

}
