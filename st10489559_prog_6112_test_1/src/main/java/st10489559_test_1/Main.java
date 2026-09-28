package st10489559_test_1;

public class Main {
    public static void main(String[] args) {

        //declare arrays
        String [] consoles = {"PS5","XBOX","SWITCH"};
        //String [] cityCodes = {"CPT","PEL","PRE"};
        String [] cityfullNames = {"Cape Town     ","Port Elizabeth","Pretoria      "};
        int [][]  consoleSales = {{1000, 2000, 3000},{2000, 3000,4000},{1500,1100,1200}};

        System.out.println("--------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------------");

        //report output loop
        for (int i = 0; i < consoleSales.length; i++) {
            //print cities
            System.out.printf("%-10s",cityfullNames[i]);
            for (int j = 0; j < consoleSales[i].length; j++) {
                System.out.printf("%12d",consoleSales[i][j]);
                
            }
            //separates input on new line
            System.out.println();
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------------");
        for (int x = 0; x < consoleSales.length; x++) {
            int citytotals = 0;
            for (int y = 0; y < consoleSales[x].length; y++) {
                citytotals += consoleSales[x][y];
            }
            System.out.printf("%-10s", cityfullNames[x]);
            System.out.printf("%12d", citytotals);
            System.out.println();
        }
    
    }
}