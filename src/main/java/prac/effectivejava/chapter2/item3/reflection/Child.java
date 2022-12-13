package prac.effectivejava.chapter2.item3.reflection;

public class Child extends Parent{

    public String cstr1 = "1";
    private String cstr2 = "2";

    public Child() {
    }

    private Child(String str) {
        cstr1 = str;
    }

    public int Method4(int n) {
        System.out.println("method4: " + n);
        return n;
    }

    private int Method5(int n) {
        System.out.println("method5: " + n);
        return n;
    }
}
