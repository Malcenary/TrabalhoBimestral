package trabalhobimestral;
    import java.util.Scanner;
public class Atv06 {
    public static void main(String[] args) {
        /*6. Faça um programa que receba o nome e 4 notas de um aluno. O programa deve calcular a
        média, em que MEDIA = (NOTA1 + NOTA2 + NOTA3 + NOTA4) / 4, e mostrar uma
        mensagem com o nome e a média do aluno.*/
        Scanner leitura = new Scanner(System.in);
        double nota01, nota02, nota03, nota04, media;
        System.out.println("Calculo media Notas");
        System.out.printf("Nome do Aluno:");
        String nome = leitura.nextLine();
        System.out.printf("Primeira Nota:");
        nota01 = leitura.nextDouble();
        System.out.printf("Segunda Nota:");
        nota02 = leitura.nextDouble();
        System.out.printf("Terceira Nota:");
        nota03 = leitura.nextDouble();
        System.out.printf("Quarta Nota");
        nota04 = leitura.nextDouble();
        media = (nota01 + nota02 + nota03 + nota04) / 4;
        System.out.printf(nome + " sua média é: " + media);
        
        
    }
}
