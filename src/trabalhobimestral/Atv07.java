package trabalhobimestral;
    import java.util.Scanner;
public class Atv07 {
    /*7. Crie um programa que receba a distância e a quantidade de litros de combustível e mostra
    o consumo médio do automóvel em uma determinada viagem:*/
    public static void main(String[] args) {
       Scanner leitura = new Scanner(System.in);
       double distancia, litros, media ;
       System.out.printf("Qual a distância percorrida:");
       distancia = leitura.nextDouble();
       System.out.printf("Qual a quantidade de litros gastos:");
       litros = leitura.nextDouble();
       media = distancia / litros;
       System.out.printf("O consumo medio do veiculo foi de: %.2f", media);
       
    }
    
    
   
    
    
}
