package prac.effectivejava.chapter2.item3.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws Exception {
        //Class 찾기
        Class aClass = Child.class;
        System.out.println("aClass.getName() = " + aClass.getName()); // aClass.getName() = prac.effectivejava.chapter3.item3.reflection.Child

        //Class 를 직접 참조할 수 없다면 패키지네임이 포함된 클래스의 이름으로 찾기
        Class aClass1 = Class.forName("prac.effectivejava.chapter2.item3.reflection.Child");

        //Constructor 찾기
        Constructor constructor = aClass1.getDeclaredConstructor();
        System.out.println("constructor.getName() = " + constructor.getName()); // constructor.getName() = prac.effectivejava.chapter3.item3.reflection.Child

        //인자를 넣으면 그 타입에 일치하는 생성자를 찾는다.
        Constructor constructor3 = aClass1.getDeclaredConstructor(String.class);
        System.out.println("constructor3.getName() = " + constructor3.getName()); // constructor3.getName() = prac.effectivejava.chapter3.item3.reflection.Child

        //private, public 등 모든 생성자 리턴
        Constructor[] constructor1 = aClass1.getDeclaredConstructors();
        for (Constructor constructor2 : constructor1) {
            System.out.println("Get constructor in Child: = " + constructor2);
//            Get constructor in Child: = public prac.effectivejava.chapter3.item3.reflection.Child()
//            Get constructor in Child: = private prac.effectivejava.chapter3.item3.reflection.Child(java.lang.String)
        }

        //public 생성자 만 리턴
        Constructor[] constructor4 = aClass1.getConstructors();
        for (Constructor constructor5 : constructor4) {
            System.out.println("constructor5 = " + constructor5);
        }

        Child child = new Child();
        Method method = aClass1.getDeclaredMethod("Method4", int.class); //객체 생성
        int returnValue = (int) method.invoke(child, 10); // child = 호출하려는 객체 , 10 = 전달할 파라미터 값
        System.out.println("returnValue = " + returnValue); // 10




    }
}
