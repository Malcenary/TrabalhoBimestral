package trabalhobimestral;
import java.util.Scanner;

public class Atv01 {
    public static void main(String[] args) {
        /*1. Faça um programa que receba o salário bruto e o valor de desconto de um funcionário.
        Calcule e mostre o salário líquido*/
    Scanner leitura = new Scanner(System.in);
        double salariobruto, salarioliquido, valordesconto, desconto;
        System.out.println("Calculo desconto Salário Bruto");
        System.out.printf("Valor salário Bruto:");
        salariobruto = leitura.nextDouble();    
        System.out.printf("Valor em pocentagem do desconto:");
        valordesconto = leitura.nextDouble();
        desconto = (valordesconto / 100) ;
        salarioliquido = salariobruto - (salariobruto  * desconto);
        System.out.printf("Valor final do salário com desconto "+ salarioliquido);
    }
    
}
