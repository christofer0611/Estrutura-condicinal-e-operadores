package estruturacondicinal;

import java.util.Scanner;

public class EstruturaCondicionaleOperadores {

    public static void main( String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um números");

        int a = scanner.nextInt();

        System.out.println("digite outro números");

        int b = scanner.nextInt();

        if (a > b) {

            System.out.println(" O maior número é: " + a );
        }
        else if (a == b) {

            System.out.println("Os dois números são iguais!");

        }
        else {
          System.out.println(" O maior número é: " + b );
        }
    }
}
