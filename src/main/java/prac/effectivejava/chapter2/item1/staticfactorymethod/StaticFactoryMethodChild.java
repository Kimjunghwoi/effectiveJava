package prac.effectivejava.chapter2.item1.staticfactorymethod;

public class StaticFactoryMethodChild extends StaticFactoryMethodC {

    @Override
    public void getName() {
        System.out.println("정상 로드 되었습니다.");
    }

}
