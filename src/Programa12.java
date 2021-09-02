
// Seção 6 - Aula 25 parte 1: Tipos numéricos Reais

public class Programa12 {
    public static void main(String[] args) {
        // Tipos primários/primitivos
        // Por padrão, os números reais em Java são considerados double
        // o float ocupa menos espaço que o double
        // Para trabalhar com dados, os tipos primitivos são mais rapidos do que os não primitivos
        float preco1 = 23.4f; // 23.40
        double preco2 = 23.4; // 23.40209823098409238

        // Tipos não primários/primitivos
        Float preco3 = 44.5f;
        Double preco4 = 44.5;

        System.out.println("float -> preco1 " + preco1);
        System.out.println("double -> preco2 " + preco2);
        System.out.println("Float -> preco3 " + preco3);
        System.out.println("Double -> preco4 " + preco4);

    }
}
