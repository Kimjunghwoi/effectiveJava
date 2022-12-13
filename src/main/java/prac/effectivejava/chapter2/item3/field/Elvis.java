package prac.effectivejava.chapter2.item3.field;

// 코드 3-1 public static final 필드 방식의 싱글턴 (23쪽)
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();

    private Elvis() { }

    public void leaveTheBuilding() {
        System.out.println("기다려 자기야, 지금 나갈께!");
    }

    // 이 메서드는 보통 클래스 바깥(다른 클래스)에 작성해야 한다!
    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}

//장점
//- 해당 클래스가 싱글턴임이 API에 명백히 드러난다는 것
//    -> public static 필드가 final 이니 절대로 다른 객체를 참조할 수 없다. (5줄)
//- 간결함