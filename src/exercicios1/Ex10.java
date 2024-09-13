package exercicios1;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] agrs){
       Scanner ler = new Scanner (System.in);

       System.out.println("A quantos anos voce fuma?");
       int anos = ler.nextInt();

       System.out.println("Quantos cigarros por dia voce fuma?");
       int cigarrospordia = ler.nextInt();

       System.out.println("Qual o valor da carteira de cigarros?");
       double valorcarteira = ler.nextInt();

        int cigarrosPorCarteira = 20;

        double valorgastocig = (cigarrospordia / (double) cigarrosPorCarteira) * valorcarteira * 365 * anos;
        System.out.printf("Você gastou aproximadamente R$%.2f em cigarros.%n", valorgastocig);
    }
}
