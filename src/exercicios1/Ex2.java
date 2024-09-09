package exercicios1;
import java.util.Scanner;
public class Ex2 {
    public static void main (String[] agr){
       Scanner ler = new Scanner(System.in);

       System.out.print("Digite a quantidade de km percorridos ");
       int distancia = ler.nextInt();

       System.out.print("Digite a quantidade de litros gastos -+");
       int combustivel = ler.nextInt();

       if (combustivel == 0){
       System.out.println("Combustivel nao pode ser 0:");
       }
       else {
           int consumo = distancia / combustivel;
           System.out.printf("Carro faz %d km por litro\n",consumo);
       }
    }
}
