package exercicios1;
import java.util.Scanner;
public class Ex8 {
    public static void main (String[] agr){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int n1 = ler.nextInt();

        System.out.println("Digite o segundo numero: ");
        int n2 = ler.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int n3 = ler.nextInt();

        System.out.println("Digite o quarto numero: ");
        int n4 = ler.nextInt();

        if(n1>n2 && n1>n3 && n1>n3) {
            System.out.print("O maior numero e: "+ n1);
        }
        if(n2>n1 && n2>n3 && n2>n4) {
            System.out.printf("O maior numero e: "+ n2);
        }
        if (n3>n1 && n3>n2 && n3>n4) {
            System.out.printf("O maior numero e:" + n3);
        }
        if (n4>n1 && n4>n2 && n4>n3) {
            System.out.print("O maior numero e:" + n4);
        }

        if(n1<n2 && n1<n3 && n1<n3) {
            System.out.print(" e o menor numero e: " + n1);
        }
        if(n2<n1 && n2<n3 && n2<n4) {
            System.out.printf(" e o menor numero e: " + n2);
        }
        if (n3<n1 && n3<n2 && n3<n4) {
            System.out.printf(" e o menor numero e: " + n3);
        }
        if (n4<n1 && n4<n2 && n4<n3) {
            System.out.printf(" e o menor numero e: " + n4);
        }

    }
}
