package prac.effactivejava.chapter2.item1.staticfactorymethod;

import org.junit.jupiter.api.Test;

class StaticFactoryMethodTest {

    @Test
    void getNewInstance() {
        StaticFactoryMethodA staticFactoryMethodA = StaticFactoryMethodA.getNewInstance();
        StaticFactoryMethodA staticFactoryMethodA2 = StaticFactoryMethodA.getNewInstance();
        System.out.println("(staticFactoryMethod == staticFactoryMethod2) = " + (staticFactoryMethodA == staticFactoryMethodA2));
        //(staticFactoryMethod == staticFactoryMethod2) = true
    }
}