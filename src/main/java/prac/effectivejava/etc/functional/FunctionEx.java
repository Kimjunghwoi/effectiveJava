package prac.effectivejava.etc.functional;


import java.util.function.Function;

/**
 * 매개값도 있고, 리턴값도 있다.
 * 주로 매개값을 반환값으로 매핑할 때
 * 즉, 타입 변환이 목적일 때 사용한다.
 * applyXXX 추상 메소드를 갖고 있다.
 */
public class FunctionEx {

    public static void main(String[] args) {
        Function<Integer, Integer> function = x -> x * x;
        Function<Integer, String> function2 = x -> "result: " + x;

        Integer result = function.apply(10);
        String result2 = function.andThen(function2).apply(10);

        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);

    }

}
