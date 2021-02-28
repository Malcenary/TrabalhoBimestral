package trabalhobimestral;
    import java.util.Scanner;
public class Atv08 {
    public static void main(String[] args) {
        /*8. Crie um programa que receba um valor em reais (R$) e mostre o valor correspondente
        convertido em Guarani (G$). Considere a cotação do dia como 1 real equivalente a 1250
        guaranis.*/
        Scanner leitura = new Scanner(System.in);
        double real, convertido;
        System.out.println("Conversão Reais para Guaranis");
        System.out.printf("Valor em Reais:");
        real = leitura.nextDouble();
        double guarani = 1250;
        convertido = real * guarani;
        System.out.printf("Valor em Guaranis: "+ convertido);
        
    }
}
