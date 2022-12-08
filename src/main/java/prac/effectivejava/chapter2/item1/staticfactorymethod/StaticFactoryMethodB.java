package prac.effectivejava.chapter2.item1.staticfactorymethod;



public abstract class StaticFactoryMethodB {
    // fourth . 입력 매개변수에 따라 매번 다른 클래스의 객체를 반환 할 수 있다.
    abstract void getName();

    public static StaticFactoryMethodB getNewInstance(String code) {
        StaticFactoryMethodB staticFactoryMethodB = null;
        if (code.indexOf("2") == 1) {
            staticFactoryMethodB = new Point();
        } else {
            staticFactoryMethodB = new Coupon();
        }

        return staticFactoryMethodB;
    }


}

class Coupon extends StaticFactoryMethodB {
    public void getName() {
        System.out.println("쿠폰을 발행합니다");
    }
}

class Point extends StaticFactoryMethodB {
    public void getName() {
        System.out.println("포인트를 1000점 적립합니다");
    }
}

