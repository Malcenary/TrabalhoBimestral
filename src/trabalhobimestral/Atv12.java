package trabalhobimestral;
    import java.util.Scanner;
public class Atv12 {
    /*12. Escreva um programa que receba uma temperatura em graus centígrados e apresente a
    temperatura convertida em graus Fahrenheit.*/
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Calculo conversao graus celsios para fahrenheit.");
        System.out.printf("Informe o valor dos graus:");
        double graus = leitura.nextDouble();
        graus = (9*graus+160)/5;
        System.out.printf("O valor em Fahrenheit é:%.2f",graus);
    
    
    }
    
    
}
