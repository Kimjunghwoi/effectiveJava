package prac.effectivejava.chapter2.item1.staticfactorymethod;

import java.lang.reflect.InvocationTargetException;

public abstract class StaticFactoryMethodC {
    // fifth . 정적 팩터리 메서드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도 된다.

    public abstract void getName();

    public static StaticFactoryMethodC getNewInstance() {
        StaticFactoryMethodC staticFactoryMethodC = null;

        try {
            Class<?> aClass = Class.forName("prac.effectivejava.chapter2.item1.staticfactorymethod.StaticFactoryMethodChild");
            staticFactoryMethodC = (StaticFactoryMethodC) aClass.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 없습니다");
        } catch (InstantiationException e) {
            System.out.println("메모리에 올릴 수 없습니다.");
        } catch (IllegalAccessException e) {
            System.out.println("클래스파일 접근 오류입니다.");
        } catch (InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        return staticFactoryMethodC;

        //Test 참조
    }


}
