package exercicios1;
import java.util.Scanner;
public class Ex9 {
    public static void main(String[] agr) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = ler.nextLine();

        System.out.println("Digite sua primeira nota");
        int nota1 = ler.nextInt();

        System.out.println("Digite sua segunda nota");
        int nota2 = ler.nextInt();

        System.out.println("Digite sua terceira nota");
        int nota3 = ler.nextInt();

        double somanotas = (nota1+nota2+nota3);
        double media = somanotas/3;

        if(media>=7) {
            System.out.printf("%s esta aprovado", nome);
        }
        if(media>=5 && media<7) {
            System.out.printf("%s esta em exame", nome);
        }
        if(media<5){
            System.out.printf("%s esta reprovado", nome);
        }

    }
}
