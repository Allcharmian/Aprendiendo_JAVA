import java.util.Scanner;

public class Inicio {
    public static int Suma(int numero){
            numero = numero + 2;
            return numero;
    }

    public static void main(String[] args) {

        int numero1, numero2, suma, agregar;

        System.out.println("***Suma de dos numeros***");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        numero1 = teclado.nextInt();
        System.out.println("ingresa el segundo numero");
        numero2 = teclado.nextInt();
        suma = numero1 + numero2;
        System.out.println("La suma de los numeros es: " + suma);

        do {
            System.out.println("Quieres agregarle 2 a la suma?");
            System.out.println("1: Si");
            System.out.println("2: No");
            agregar = teclado.nextInt();
            if (agregar == 1) {
                System.out.println(Suma(suma));
                suma = Suma(suma);
            }
            else if (agregar == 2){
                System.out.println("gracias por usar calculadora de suma y agregado");
            }
            else{
                System.out.println("Error, elige una de la opcines validas");
            }
        } while (agregar != 2);

        teclado.close();

    }
}