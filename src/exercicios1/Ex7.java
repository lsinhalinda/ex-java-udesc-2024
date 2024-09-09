package exercicios1;
import java.util.Scanner;
public class Ex7 {
    public static void main (String[] agr) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o valor da sua hora trabalhada?");
        int valorhora = ler.nextInt();

        System.out.println("Quantas horas voce trabalhou durante o mes?");
        int horastrabalhadas = ler.nextInt();
        int salario;
        salario = horastrabalhadas*valorhora;

        System.out.printf("Seu salario e: " + salario);
    }
}
