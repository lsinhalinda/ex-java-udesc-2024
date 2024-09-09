package exercicios1;
import java.util.Scanner;
public class Ex5 {
    public static void main (String[] agr){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite seu nome");
 String nome = scanner.nextLine();
 System.out.print("Digite sua idade");
 int idade = scanner.nextInt();

 if (idade<16){
     System.out.printf("%s não pode votar",nome);
 }
 else {
     System.out.printf("%s esta apto a votar",nome);
 }
    }
}
