package exercicios1;
import java.util.Scanner;
public class Ex6 {
    public static void main (String[] agr) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = ler.nextInt();

        if (idade >= 18 && idade <= 67) {
            System.out.println("Pode doar sangue");
        } else {
            System.out.println("Não pode doar sangue :)");
        }
    }
}

