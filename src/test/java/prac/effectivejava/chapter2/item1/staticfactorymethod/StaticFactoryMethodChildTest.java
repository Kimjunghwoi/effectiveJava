package prac.effectivejava.chapter2.item1.staticfactorymethod;

import org.junit.jupiter.api.Test;

class StaticFactoryMethodChildTest {

    @Test
    void getName() {
        StaticFactoryMethodC staticFactoryMethodC = StaticFactoryMethodC.getNewInstance();

        staticFactoryMethodC.getName();
        //정상 로드 되었습니다.
    }
}