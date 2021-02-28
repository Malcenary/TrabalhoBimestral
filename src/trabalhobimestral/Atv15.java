package trabalhobimestral;
    import java.util.Scanner;
public class Atv15 {
    public static void main(String[] args) {
        /*15. Crie um programa que receba um ano de nascimento. Calcule a partir do ano a idade que a
        pessoa tem aproximadamente.*/
        Scanner leitura = new Scanner(System.in);
        int anonasci, anoatual, resultado;
        System.out.println("Calculo idade");
        System.out.printf("Ano de nascimento :");
        anonasci = leitura.nextInt();
        System.out.printf("Ano atual:");
        anoatual = leitura.nextInt();
        resultado = anoatual - anonasci ;
        System.out.printf("Sua idade aproximada é de "+resultado+" anos");
    }
}
