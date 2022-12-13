package prac.effectivejava.chapter3.item3.staticfactory;

// 코드 3-2 정적 팩터리 방식의 싱글턴 (24쪽)
public class Elvis {
    private static final Elvis INSTANCE = new Elvis();
    private Elvis() { }
    public static Elvis getInstance() { return INSTANCE; }

    public void leaveTheBuilding() {
        System.out.println("기다려 자기야, 지금 나갈께!");
    }

    // 이 메서드는 보통 클래스 바깥(다른 클래스)에 작성해야 한다!
    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTheBuilding();
    }
}

//장점
//- API를 바꾸지 않고도 싱글턴이 아니게 변경할 수 있다는 점
//  ->  유일한 인스턴스를 반환하는 팩터리메서드 (getInstance())가 호출하는 스레드별로 다른 인스턴스를
//     넘겨주게 할 수 있다.
//- 원한다면 정적 팩터리를 제네릭 싱글턴 팩터리로 만들수 있다.
//  ->  public static <E> Set<E> getinstance(Set<E> s1, Set<E> s2)
//- 정적 팩터리의 메서드 참조를 공급자(supplier)로 사용할 수 있다는 점이다.
//  -> Elvis::getinstance ==> Supplier<Elvis>



