package trabalhobimestral;
    import java.util.Scanner;
public class Atv14 {
    public static void main(String[] args) {
        /*14. Para vários tributos, a base de cálculo é o salário mínimo. Fazer um programa que receba o
        valor do salário mínimo e o valor do salário de uma pessoa. Calcular e mostrar quantos
        salários mínimos essa pessoa ganha.*/
        Scanner leitura = new Scanner(System.in);
        double salarioMin, salarioRec, resultado ;
        System.out.printf("Valor do salário minimo:");
        salarioMin = leitura.nextDouble();
        System.out.printf("Valor salário recebido:");
        salarioRec = leitura.nextDouble();
        resultado = salarioRec / salarioMin ;
        System.out.printf("Total de salários minimos recebidos: %.1f",resultado);
        
        
    }
    
}
