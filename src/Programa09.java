// Seção 5 - Aula 22: For e Foreach
// Esse programa recebe até 5 entradas de dados
import java.util.Scanner;
// for
public class Programa09 {
    public static void main(String[] args) {
        int idade;
        String nome;
        Scanner teclado = new Scanner(System.in);

        // variável de controle (int i = 0); condição de parada (i < 5); forma de incremento (i++);
        // i++ é igual a i = i + 1
        for(int i = 0; i < 5; i++) {
            System.out.println("Informe seu nome:");
            nome = teclado.nextLine();

            System.out.println("Informe sua idade:");
            idade = Integer.parseInt(teclado.nextLine());

            if (idade > 0) {
                System.out.println(nome + " tem " + idade + " anos");
            }
        }
        teclado.close();
    }
}
