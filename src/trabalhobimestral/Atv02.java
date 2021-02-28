package trabalhobimestral; 
    import java.util.Scanner;
public class Atv02 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        /*2. Crie um programa que receba o nome de um pessoa e o salário dela. Mostre a mensagem
        abaixo baseado nas entradas de dados:*/
        System.out.printf("Nome :");
        String nome = leitura.nextLine();
        System.out.printf("Salário :");
        double salario = leitura.nextDouble();
        double dobrosalario = salario * 2 ;
        System.out.printf(nome +" o dobro do seu salário é: "+dobrosalario);
        
    }
}
