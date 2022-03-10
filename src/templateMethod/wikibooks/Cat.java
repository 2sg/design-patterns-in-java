package templateMethod.wikibooks;

public class Cat extends Animal {

    //추상메소드 오버라이딩
    @Override
    void play() {
        System.out.println("meow");
    }

    //Hook메소드 오버라이딩
    @Override
    void runSomething() {
        System.out.println("meow / wagging");
    }

}
