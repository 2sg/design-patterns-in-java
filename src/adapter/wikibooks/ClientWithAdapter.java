package adapter.wikibooks;

public class ClientWithAdapter {
    public static void main(String[] args) {
        AdapterServiceA adapterServiceA = new AdapterServiceA();
        AdapterServiceB adapterServiceB = new AdapterServiceB();

        adapterServiceA.runService();
        adapterServiceB.runService();
    }
}
