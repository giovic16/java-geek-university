import java.util.Scanner;

// Seção 5 - Aula 21: While e do while
// while
// Esse programa recebe dados até que a idade seja menor que 1
public class Programa07 {
    public static void main(String[] args) {
        int idade = 1;
        String nome;

        // Para receber entrada do usuário
        Scanner teclado = new Scanner(System.in);

        // Sempre verifica o valor antes de executar o bloco
        while(idade > 0) {
            System.out.println("Informe seu nome:");
            // Para receber uma entrada tipo string
            nome = teclado.nextLine();

            System.out.println("Informe sua idade:");
            // Para receber uma entrada tipo int
            // idade = teclado.nextInt(); // Bug
            // Recebe o dado como str e converte em int
            idade = Integer.parseInt(teclado.nextLine());

            System.out.println(nome + " tem " + idade + " anos");
        }

        teclado.close();

    }
}
