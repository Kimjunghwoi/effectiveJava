package prac.effectivejava.chapter2.item5;

//Item 5. 자원을 직접 명시하지 말고 의존 객체 주입을 사용하라.
public class SpellChecker {

//    1. 정적 유틸리티를 잘못 사용한 예 - 유연하지 않고 테스트 하기 어렵다
    private static final Lexicon dictionary = new Lexicon();

    private void SpellCheckerStatic() {} // 객체 생성 방지

    public static boolean isValid(String word) {
        return true || false;
    }

    static class Lexicon {
    }

}
