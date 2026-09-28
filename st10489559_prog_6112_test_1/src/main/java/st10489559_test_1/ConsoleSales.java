package st10489559_test_1;

public class ConsoleSales extends Consoles {

    private String consoleType;
    private String Store;
    private int sales;    
    
    public ConsoleSales (String consoleType,String storeType, int sales) {
        this.consoleType = consoleType;
        this.sales = sales;
        this.Store = storeType;
    }

    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public int getTotalSales() {
        return sales;
    }

    @Override 
    public String getStore() {
        return Store;
    }

    public void printReport() {
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("***************************");

        System.out.println("CONSOLE: "+getConsoleType());
        System.out.println("STORE: "+getStore());
        System.out.println("SALES TOTAL: "+getTotalSales());
    }
}
