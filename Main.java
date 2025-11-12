import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    static int ejercicio;
    static Scanner sc;

    public static void main(String[] args)
    {
        Utils.sc = new Scanner(System.in);
        ejercicio = 0;
        menu();
    }

    private static void menu()
    {
        do
        {
            System.out.println("--Práctica 2. Funciones Avanzadas--");
            System.out.println("Ejercicio1");
            System.out.println("Ejercicio2");
            System.out.println("Ejercicio3");
            System.out.println("Ejercicio4");
            System.out.println("Ejercicio5");
            System.out.println("Finalizar");

            ejercicio = Utils.validaInt();
            switch (ejercicio)
            {
                case 1:
                    Ejercicio1();
                    break;

                case 2:
                    Ejercicio2();
                    break;

                case 3:
                    Ejercicio3();
                    break;

                case 4:
                    Ejercicio4();
                    break;
            }
        }while(ejercicio!=9);
    }

    private static void Ejercicio1()
    {
        /* Realiza un programa que nos pida número enteros hasta que se introduzca el 0,
        diciéndonos, para cada número introducido si es primo o no. Hay que recordar
        que un número es primo si es divisible por si mismo y por 1. El 1 no es primo por
        convenio. Se debe crear una función que pasándole un número entero devuelva
        si es primo o no. */

        int numero;
        do
        {
            System.out.println("Introduce 0 para salir");
            numero = Utils.sc.nextInt();
            if (numero!=0)
            {
                System.out.println(Utils.numerosPrimos(numero) ? "El número " + numero + " es primo" : "El número " + numero + " no es primo");
            }
        }while (numero!=0);

        System.out.println("Finalizando el programa");
        Utils.sc.close();
    }

    private static void Ejercicio2()
    {
        /* El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera: Se divide el
        número de DNI entre 23 y el resto es codificado por una letra según la siguiente equivalencia:
        0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B", 12: "N",
        13: "J", 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E".
        Escribe un programa que pida el DNI y muestre por pantalla la letra asociada. Para ello se deberá crear una función a la que se le pase el número y devuelva la letra. */

        System.out.print("Introduce tu DNI: ");
        int dni = Utils.validaInt();

        char letra = Utils.letraDni(dni);
        System.out.println("Su DNI completo es: " + dni + letra);

        Utils.sc.close();
    }

    private static void Ejercicio3()
    {
        /* Realiza un programa que permita comprobar si una terna de valores enteros (3
        valores) se ajusta a la ecuación de Pitágoras: x ² + y ² = z ². El programa solicita al
        usuario los valores x, y, z. Se deberá crear una función a la que se le pase x, y, z y
        devuelva si son iguales o no. */

        System.out.print("Introduce el valor de x: ");
        int valorX = Utils.validaInt();

        System.out.print("Introduce el valor de y: ");
        int valorY = Utils.validaInt();

        System.out.print("Introduce el valor de z: ");
        int valorZ = Utils.validaInt();

        if(Utils.teoremaPitagoras(valorX, valorY, valorZ))
        {
            System.out.println("La terna de " + valorX + ", " + valorY + ", " + valorZ + " cumple con el teorema de Pitágoras");
        }

        else
        {
            System.out.println("La terna de " + valorX + ", " + valorY + ", " + valorZ + " no cumple con el teorema de Pitágoras");
        }
    }

    private static void Ejercicio4()
    {
        /* Escribe un programa que imprima las tablas de multiplicar del 1 al 10.
        Implementa una función que reciba un número entero como parámetro e
        imprima su tabla de multiplicar. */

        for (int numero = 1; numero <=10; numero++)
        {
            Utils.tablaMultiplicar(numero);
        }
    }

    private static void Ejercicio5()
    {
        /* Escribe un programa que muestre un menú con 2 opciones: “1.Circunferencia” y “2.Área”.
        En ambas se le pedirá al usuario que introduzca un radio y luego se le mostrará el cálculo
        oportuno. Implementa las funciones:
        int menu() // Muestra el menú y devuelve el número elegido
        double pideRadio() // Pide que se introduzca el radio y lo devuelve
        double circunferencia(double r) // Calcula la circunferencia y la devuelve
        double area(double r) // Calcula el área y la devuelve
        Modifica el programa añadiendo otra opción llamada “Volumen”, permitiendo que el
        usuario también pueda solicitar el cálculo del volumen. Añade la función:
        double volumen(double r) // Calcula el volumen y lo devuelve
        Modifica el programa añadiendo otra opción llamada “Todas” en la que se pida el radio
        una sola vez y se muestren los tres cálculos posibles (circunferencia, área y volumen).
        Modifica el programa anterior de modo que el proceso se repita una y otra vez (mostrar
        menú -> realizar el cálculo -> volver a mostrar menú). Añade una opción más llamada
        “Salir” que terminará el programa si es elegida.*/

        /* Estoy realizando cambios para la práctica de Entornos*/

    }
}