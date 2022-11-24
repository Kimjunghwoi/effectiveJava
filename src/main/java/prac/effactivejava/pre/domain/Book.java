package prac.effactivejava.pre.domain;


/**
 * ITEM 1. 생성자 대신 정적 팩터리 메서드를 고려하라.
 */
public class Book {
    private String name;
    private String author;
    private String publisher;

    /**
     * 생성자를 이용한 객체 초기화
     * 생성자의 이름은 클래스 명과 같아야 한다
     * Book book = new Book("effectiveJava");
     * 단점 1 . effectiveJava 가 어떤 변수인지 알기 어렵다.
     *
     */
//    public Book(String name) {
//        this.name = name;
//    }

    /**
     * 팩토리 메서드를 이용한 객체 초기화
     * 이름 지정이 가능하다
     * Book book = Book.createBookWithName("effectiveJava");
     * 장점 1. 이름이 effectiveJava 라는 걸 메서드 명을 보고 알 수 있다.
     */

    public static Book createBookWithName(String name) {
        Book book = new Book();
        book.name = name;
        return book;
    }

    /**
     *
     */
//    public Book(String author) {
//        this.author = author;
//    }



    public static Book createBookWithAuthor(String author) {
        Book book = new Book();
        book.author = author;
        return book;
    }
}