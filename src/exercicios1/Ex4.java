package exercicios1;
import java.util.Scanner;
public class Ex4 {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            System.out.println("Digite seu sexo com M ou F: ");
            String sexo = ler.nextLine();

            if(sexo.equals("m")){
                System.out.print("Seu sexo e masculino");
            }
            if(sexo.equals("f")){
                System.out.print("Seu sexo e feminino");
            }
        }
}
