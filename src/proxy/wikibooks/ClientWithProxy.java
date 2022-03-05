package proxy.wikibooks;

public class ClientWithProxy {
    public static void main(String[] args) {
        IService proxy = new ProxyImpl();
        System.out.println(proxy.runSomething());
    }
}
