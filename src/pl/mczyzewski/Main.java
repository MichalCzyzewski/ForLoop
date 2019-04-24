package pl.mczyzewski;



public class Main {

    public static void main(String[] args) {

        System.out.println("10,000 at 2% intrest = " + ForLoop.calculateInterest(10000,2) );

        for (int x=0; x<5;x++)
        {
            System.out.println("Loop " + x + " Hello");
        }

    }
}
