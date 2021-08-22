// Seção 5 - Aula 22 parte 2: For e Foreach
// Foreach == Para cada

// Esse programa imprime os caracteres na vertical
public class Programa10 {
    public static void main(String[] args) {
        String nome = "Geek University";

        // Para um dos caracteres da string, imprima o caractere
        for (char letra : nome.toCharArray()) {
            System.out.println(letra); // Imprime de forma vertical
            //System.out.print(letra); // Imprime tudo na mesma linha

        }
    }
}
