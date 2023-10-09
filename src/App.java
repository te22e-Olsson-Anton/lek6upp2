import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner tb = new Scanner(System.in);

        System.out.println("Skriv ett tal");
        int tal = tb.nextInt();

        Math.round(tal);

        System.out.println(Math.round(tal / 1000) * 1000 + 1000);




        System.out.println("Ange antal timmar");
        double timmar = tb.nextDouble();
        System.out.println("Ange antal minuter");
        double minuter = tb.nextDouble();
        System.out.println("Ange antal sekunder");
        double sekunder = tb.nextDouble();

        double totalaSekunder = timmar * 3600 + minuter * 60 + sekunder;
        double endastTimmar = totalaSekunder / 3600;

        double restSekunder = totalaSekunder % 3600;
        double endastMinuter = restSekunder / 60;

        double endastSekunder = restSekunder % 60;


        System.out.println("Endast timmar: " +endastTimmar);
        System.out.println("Endast minuter: " +endastMinuter);
        System.out.println("Endast sekunder " +endastSekunder);

        
    }
}
