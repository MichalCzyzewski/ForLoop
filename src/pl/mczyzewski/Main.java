package pl.mczyzewski;



public class Main {

    public static void main(String[] args) {

        System.out.printf("");

        for (int x=2; x<=8;x++)
        {
            System.out.println("10,000 at " + x +"% intrest = " + String.format("%.2f",ForLoop.calculateInterest(10000,x)));
        }

    }
}
