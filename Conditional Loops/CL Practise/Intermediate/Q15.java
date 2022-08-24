import java.util.Scanner;
//Find nCr and nPr
public class Q15
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = input.nextInt();
        System.out.print("Enter r : ");
        int r = input.nextInt();
        int NminusR= n - r;

        int nfactorial = 1;
        while (n>0)
        {
            nfactorial = nfactorial * n;
            n--;
        }


        int rfactorial = 1;
        while (r > 0)
        {
            rfactorial = rfactorial * r;
            r--;
            }

        int NminusRfactorial = 1;
        while (NminusR > 0)
        {
            NminusRfactorial = NminusRfactorial * NminusR;
            NminusR--;
        }


        System.out.println("n factorial value is : " + nfactorial);
        System.out.println("r factorial value is : " + rfactorial);
        System.out.println("n-r factorial value is : " + NminusRfactorial);

        System.out.println("The nPr value is : " + nfactorial / NminusRfactorial);
        System.out.println("The nCr value is : " + (nfactorial) / (rfactorial * NminusRfactorial));

        }

        }



