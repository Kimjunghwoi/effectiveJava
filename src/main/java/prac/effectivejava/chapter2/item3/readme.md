# private 생성자나 열거 타입으로 싱글턴임을 보증하라

## 1. 싱글턴이란 인스턴스를 오직 하나만 생성할 수 있는 클래스를 말한다.
#### stateless 객체나 설계상 유일해야 하는 시스템 컴포넌트를 들 수 있다.
## 2. 클래스를 싱글턴으로 만들면 이를 사용하는 클라이언트를 테스트하기가 어려워질 수 있다.


### 1. public static final
####   해당클래스가 싱글턴임이 명백하게 드러나고, 간결하다는 장점    
### 2. static factory
#### 정적팩터리 매서드를 사용하기 때문에 원한다면 싱글턴 방식이 아니게 변경 가능
####    => 스레드 별로 다른 인스턴스 제공
#### 정적팩터리를 제네릭 싱글턴팩터리로 만들 수 있다.

    public class UseSupplier {

        private final Supplier<? extends StaticSingleton> singleton;
    
        public UseSupplier(Supplier<? extends StaticSingleton> singleton) {
            this.singleton = singleton;
        }
    }

    // 매개변수로 전달
    UseSupplier useSupplier = new UseSupplier(StaticSingleton::getInstance);


##  3. enum type (추천)
#### 대부분의 상황에서는 원소가 하나뿐인 열거 타입이 싱글턴을 만드는 가장 좋은 방법이다  
#### 구현이 쉽고 , 직/역직렬화 상황에 대한 처리도 필요가 없으며 리플렉션 공격에도 제 2의 인스턴스가 생성되는걸 막아준다.

    public enum EnumSingleton {
        INSTANCE;
    
        void doSomething() {
            System.out.println("Enum");
        }
    }
