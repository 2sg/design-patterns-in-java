package decorator.wikibooks;

public class ClientWithDecolator {
    public static void main(String[] args) {
        IService decorator = new DecoratorImpl();
        System.out.println(decorator.runSomething());
    }
}
