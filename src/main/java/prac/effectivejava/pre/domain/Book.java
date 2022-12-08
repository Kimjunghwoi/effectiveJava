package prac.effectivejava.pre.domain;


/**
 * ITEM 1. 생성자 대신 정적 팩토리 메서드를 고려하라.
 */
public class Book {
    private String name;
    private String author;

    /**
     * 생성자를 이용한 객체 초기화
     * 생성자의 이름은 클래스 명과 같아야 한다
     * Book book = new Book("effectiveJava");
     * 단점 1. effectiveJava 가 어떤 변수인지 알기 어렵다.
     * 단점 2. 규격이 정해져 있어 운영하면서 많은 변수를 포함시키게 된다.
     *      설명추가 - 아래 와 같이 name 만 넣은 생성자를 만들었을 때 외부에서 author 에 접근 할 수 없다.
     */
//    public Book(String name) {
//        this.name = name;
//    }

    /**
     * 팩토리 메서드를 이용한 객체 초기화
     * 이름 지정이 가능하다
     * Book book = Book.createBookWithName("effectiveJava");
     * 장점 1. 이름이 effectiveJava 라는 걸 메서드 명을 보고 알 수 있다.
     * 장점 2. 객체 생성을 관리할 수 있어 불필요한 객체는 만들지 않을 수 있다.
     */

    public static Book createBookWithName(String name) {
        Book book = new Book();
        book.name = name;
        return book;
    }

    /**
     *  - from : 매개변수 하나로 하나의 인스턴스 만듦
     *  - of : 여러 매개변수로 인스턴스 만듦
     *  - valueOf : from 과 of의 자세한 버전
     *  - getInstance, instance : (매개변수를 갖거나 갖지 않거나) 같은 인스턴스임을 보장하지 않는 인스턴스 반환
     *  - create, newInstance : 매번 새로운 인스턴스를 생성하여 반환
     *  - getType : 인스턴스를 생성할 때, 해당 클래스가 아닌 다른 클래스에서 생성할 때 사용
     *  - newType : getType 과 동일
     *  - Type : getType, newType 의 간략버전
     */

}