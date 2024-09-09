package exercicios1;
import java.util.Scanner;
public class Ex1 {

public static void main (String[] agr) {
   Scanner ler = new Scanner(System.in);

   System.out.print("Digite um numero inteiro");
   int numero = ler.nextInt();

   int antecessor = numero-1;
   int sucessor = numero+1;

   System.out.println("Antecessor: " + (numero - 1));
   System.out.println("Sucessor: " + (numero + 1));
}
}
