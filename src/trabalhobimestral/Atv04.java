package trabalhobimestral;
    import java.util.Scanner;
public class Atv04 {
    public static void main(String[] args) {
        /*4. Crie um programa para calcular e mostrar o IMC de uma pessoa.
        IMC = peso/altura2*/
        double peso, altura, imc;
        Scanner leitura = new Scanner(System.in);
        System.out.println("Calculo IMC");
        System.out.printf("Informe seu peso:");
        peso = leitura.nextDouble();
        System.out.printf("Informe sua altura:");
        altura = leitura.nextDouble();
        imc = peso / Math.pow(altura,2);
        System.out.printf("IMC: %.2f",imc);
    }
}
