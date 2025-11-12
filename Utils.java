import java.util.Scanner;

public class Utils {
    static Scanner sc;

    public static int validaInt() {
        while (!sc.hasNextInt()) {
            System.out.println("Eso no es un número válido.");
            sc.next();
        }

        return sc.nextInt();
    }

    public static double validaDouble() {
        while (!sc.hasNextDouble()) {
            System.out.println("Eso no es un número válido.");
            sc.next();
        }

        return sc.nextDouble();
    }

    public static boolean numerosPrimos(int n)
    {
        if (n<=1)
        {
            return false;
        }

        for (int i = 2; i <=Math.sqrt(n) ; i++)
        {
            if (n%i==0)
            return false;
        }
        return true;
    }

    public static char letraDni(int num)
    {
        char[] letrasNIF = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int resto = num%23;
        return letrasNIF[resto];
    }

    public static boolean teoremaPitagoras(int num1, int num2, int num3)
    {
        return (num1*num1)+(num2*num2)==(num3*num3);
    }

    public static void tablaMultiplicar(int n)
    {
        System.out.println("Tabla del número " + n + " :");
        for (int i = 1; i <=10; i++)
        {
            System.out.println(n + "x" + i + "=" + (n*i));
        }

        System.out.println();
    }
}