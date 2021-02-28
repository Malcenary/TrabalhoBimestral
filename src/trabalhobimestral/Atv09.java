package trabalhobimestral;
    import java.util.Scanner;
public class Atv09 {
    public static void main(String[] args) {
        /*9. Crie um programa que receba um valor em Euros (€) e mostre o valor correspondente
    convertido em Reais (R$). Considere a cotação do dia como 1 Euro equivalente a 6,41
    reais.*/
    Scanner leitura = new Scanner(System.in);
        double euro, convertido;
        System.out.println("Conversão Euro para Reais");
        System.out.printf("Valor em Euro:");
        euro = leitura.nextDouble();
        double real = 6.41 ;
        convertido = euro * real;
        System.out.printf("Valor em Reais: %.2f",convertido);
        
        
    }
    
    
    
}
