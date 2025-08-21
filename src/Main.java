import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um número:  ");


        int numero1 = scanner.nextInt();


        System.out.println("Digite outro número: ");


        int numero2 = scanner.nextInt();


        if (numero1 > numero2) {
            System.out.print("O primeiro número e maior! ");
        } else if (numero1 < numero2) {
            System.out.print("O segundo número e maior!");
        } else {
            System.out.print("Os números são iguais!");
        }

        scanner.close();

    }
}






















