
import java.util.*;

public class Ejercicio10 {

    public static void main(String[] args) {
        int suma = 0, num, n6 = 0, primerosNum = 0;
        String opc = "";
        Scanner scanner = new Scanner(System.in);

        while (suma < 1000) {
            System.out.print("Ingrse un numero: ");
            num = scanner.nextInt();
            if (num % 6 == 0) {
                n6 += 1;
            }
            if (num > 0 && num < 11) {
                primerosNum += num;

            }
            suma += num;

        }
        System.out.println("La cantidad de numeros multilos de 6 son : " + n6);
        System.out.println("La soma de los numeros que stan entre 1 y 10 es " + primerosNum);
    }

}