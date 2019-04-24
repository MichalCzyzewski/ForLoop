package pl.mczyzewski;


public class Main
{

    public static void main(String[] args)
    {
//
//
//
//        for (int x=2; x<=8;x++)
//        {
//            System.out.println("10,000 at " + x +"% intrest = " + String.format("%.2f",ForLoop.calculateInterest(10000,x)));
//        }
//
//        System.out.println();
//
//        for (int x=8; x>=2;x--)
//        {
//            System.out.println("10,000 at " + x +"% intrest = " + String.format("%.2f",ForLoop.calculateInterest(10000,x)));
//        }

        int count = 0;
        for (int x = 2; x < 13 ; x++)
        {
            if (isPrime(x))
            {

                    count++;
                    System.out.println(x + " is a prime number!");
                    if(count == 3)
                    {
                        break;
                    }




            }
        }


    }

    public static boolean isPrime(int n)
    {
        if (n == 1)
        {
            return false;
        }
        for (int i = 2; i <= n / 2; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
