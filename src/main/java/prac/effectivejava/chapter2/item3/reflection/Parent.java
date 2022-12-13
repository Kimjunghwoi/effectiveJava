package prac.effectivejava.chapter2.item3.reflection;

public class Parent {

    private String str1 = "1";
    private String str2 = "2";

    public Parent() {

    }
    private void Method1() {
        System.out.println("method1");
    }
    private void Method2(int n) {
        System.out.println("method2: " + n);
    }
    private void Method3() {
        System.out.println("method3");
    }
}
