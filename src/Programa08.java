// Seção 5 - Aula 21 parte 2: While e do while

import java.util.Scanner;

// do while
// Esse programa recebe dados até que a idade seja menor que 0

public class Programa08 {
    public static void main(String[] args) {
        int idade;
        String nome;

        // Para receber entrada do usuário
        Scanner teclado = new Scanner(System.in);

        // Primeiro executar o bloco, depos faz a checagem
        do {
            System.out.println("Informe seu nome:");
            // Para receber uma entrada tipo string
            nome = teclado.nextLine();

            System.out.println("Informe sua idade:");
            // Para receber uma entrada tipo int
            // idade = teclado.nextInt(); // Bug
            // Recebe o dado como str e converte em int
            idade = Integer.parseInt(teclado.nextLine());

            if(idade >0) {
                System.out.println(nome + " tem " + idade + " anos");
            }
        }while(idade > 0);

        teclado.close();

    }
}
