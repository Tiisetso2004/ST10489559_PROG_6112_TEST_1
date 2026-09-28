package st10489559_test_1;

public abstract class Consoles implements iConsoles {

    private String consoleType;
    private String Store;
    private int sales;

    public int getSales() {
        return sales;
    }

    public String getStore() {
        return Store;
    }

    public String getConsoleType() {
        return consoleType;
    }

}
