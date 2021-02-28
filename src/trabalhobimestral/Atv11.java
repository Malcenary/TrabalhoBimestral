package trabalhobimestral;
    import java.util.Scanner;
public class Atv11 {
    public static void main(String[] args) {
        /*11. Crie um programa que receba 5 valores de entrada e mostre o quadrado para cada número
        informado.*/
        int valor1, valor2, valor3, valor4, valor5, resultado;
        Scanner leitura = new Scanner(System.in);
        System.out.printf("Primeiro Valor:");
        valor1 = leitura.nextInt();
        System.out.printf("Segundo Valor:");
        valor2 = leitura.nextInt();
        System.out.printf("Terceiro Valor:");
        valor3 = leitura.nextInt();
        System.out.printf("Quarto Valor:");
        valor4 = leitura.nextInt();
        System.out.printf("Quinto Valor:");
        valor5 = leitura.nextInt();
        System.out.println("Valores:"+valor1+","+valor2+","+valor3+","+valor4+","+valor5);
        valor1 = (int) Math.pow(valor1, 2);
        valor2 = (int) Math.pow(valor2, 2);
        valor3 = (int) Math.pow(valor3, 2);
        valor4 = (int) Math.pow(valor4, 2);
        valor5 = (int) Math.pow(valor5, 2);
        System.out.printf("Valores ao Quadrado:"+valor1+","+valor2+","+valor3+","+valor4+","+valor5);
        
        
    }
}
