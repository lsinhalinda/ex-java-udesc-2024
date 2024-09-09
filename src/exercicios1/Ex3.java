package exercicios1;
import java.util.Scanner;

public class Ex3 {
    public static void main (String[] agr) {
    Scanner ler = new Scanner(System.in);

    System.out.print("Digite o primeiro numero ");
    int n1 = ler.nextInt();

    System.out.print("Digite o segundo numero ");
    int n2 = ler.nextInt();
    if (n1>n2){
        System.out.printf("O numero maior e: %d",n1);
    } else {
        System.out.printf("O numero maior e: %d",n2);
    }
    }
}
