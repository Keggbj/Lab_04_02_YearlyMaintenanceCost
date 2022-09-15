public class Main {
    public static void main(String[] args)
    {
     double Winter = 25_000;
     double Spring = 20_000;
     double Summer = 15_000;
     double Autumn = 20_000;
     int totalCost = (int) (Winter + Spring + Summer + Autumn);

     System.out.println("The total yearly maintenance cost is: " + totalCost);

    }
}