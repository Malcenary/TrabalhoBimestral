package trabalhobimestral;
    import java.util.Scanner;
public class Atv13 {
    public static void main(String[] args) {
        /*13. Faça um programa que receba o nome, o preço de um produto e o seu percentual de
        desconto,No final, mostrar uma mensagem com o nome do produto, o valor de desconto e o valor do
        produto com o desconto.*/
        Scanner leitura = new Scanner(System.in);
        System.out.printf("Nome do produto:");
        String nomeP = leitura.nextLine();
        System.out.printf("Porcentagem do desconto:");
        double desconto = leitura.nextDouble();
        System.out.printf("Valor do Produto:");
        double valorP = leitura.nextDouble();
        valorP = valorP - (valorP * (desconto / 100));
        System.out.printf("O(a) "+nomeP+" com desconto de "+desconto+"%% custa R$:%.2f",valorP);
        
        
    }
}
