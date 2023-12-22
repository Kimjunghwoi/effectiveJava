package prac.effectivejava.chapter2.item1.staticfactorymethod;


//Item 1. 생성자 대신 정적 팩터리 메서드를 고려하라
public class StaticFactoryMethodA {
    // first . 이름을 가질 수 있다
    private Long id;
    private String name;

    public StaticFactoryMethodA(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public StaticFactoryMethodA( String name) {

        this.name = name;
    }
    //vs

    public static StaticFactoryMethodA CreateStaticFactoryMethod(String name) {
        StaticFactoryMethodA staticFactoryMethodA = new StaticFactoryMethodA();
        staticFactoryMethodA.name = name;
//        new BigInteger(1, 2, Math.random());
//        BigInteger.probablePrime(10, Math.random());

        return staticFactoryMethodA;
    }
    // 이름을 가질 수 있기에 어떤 일을 하는지 정확하게 파악 할 수 있다.


    // second .  호출될 때마다 인스턴스를 새로 생성하지는 않아도 된다.
    private static final StaticFactoryMethodA STATIC_FACTORY_METHOD = new StaticFactoryMethodA();

    private StaticFactoryMethodA(){}

    public static StaticFactoryMethodA getNewInstance() {
//                Boolean.valueOf(name);
        return STATIC_FACTORY_METHOD;
    }

    // Test Code 참조





}
