package trabalhobimestral;
    import java.util.Scanner;
public class Atv05 {
    public static void main(String[] args) {
        /*5. Faça um programa que receba 2 notas de um aluno. O programa deve calcular a média, em
        que MEDIA = (NOTA1 + NOTA2) / 2, e mostrar uma mensagem com a média do aluno.*/
        Scanner leitura = new Scanner(System.in);
        double nota01, nota02, media;
        System.out.println("Calculo media duas notas aluno");
        System.out.printf("Primeira Nota:");
        nota01 = leitura.nextDouble();
        System.out.printf("Segunda Nota:");
        nota02 = leitura.nextDouble();
        media = (nota01 + nota02) / 2 ;
        System.out.printf("Media das Notas: %.1f",media);
        
        
    }
}
