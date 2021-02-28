package trabalhobimestral;
    import java.util.Scanner;
public class Atv10 {
    public static void main(String[] args) {
        /*10. O Shopping China está vendendo seus produtos a prazo sem juros no cartão de crédito.
        Faça um programa que receba o valor de uma compra e mostre o valor de cada prestação
        quando a compra for realizada em 1, 2, 3, 4, 5, e 6 vezes.*/
        Scanner leitura = new Scanner(System.in);
        double valor;
        System.out.printf("Valor total da compra:");
        valor = leitura.nextDouble();
        System.out.println("Valor das parcelas");
        System.out.printf("1x:%.2f%n",valor,"\n");
        System.out.printf("2x:%.2f%n",valor/2,"\n");
        System.out.printf("3x:%.2f%n",valor/3,"\n");
        System.out.printf("4x:%.2f%n",valor/4,"\n");
        System.out.printf("5x:%.2f%n",valor/5,"\n");
        System.out.printf("6x:%.2f%n",valor/6,"\n");
        
    }
    
}
