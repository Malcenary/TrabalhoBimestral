package trabalhobimestral;
    import java.util.Scanner;
public class Atv03 {
    public static void main(String[] args) {
        /*3. Bill Gates decidiu patrocinar os projetos de robótica do IFPR e pagar todos os Kits de
        robótica LEGO. Crie um programa que receba a quantidade de Kits LEGO que serão
        comprados em todos as unidades (campi) do IFPR e o valor de cada Kit. Mostre o valor
        final da compra, conforme a mensagem que será encaminhada por e-mail para ele:
        “Caro Bill Gates, o valor da compra dos Kits LEGO ficou apenas 1.000.000,00 reais”
        onde, o valor sublinhado é um valor calculado pelo programa.*/
        Scanner leitura = new Scanner(System.in);
        System.out.printf("Número de Kits a ser adquirido:");
        int kits = leitura.nextInt();
        System.out.printf("Valor unitario:");
        double valorunidade = leitura.nextDouble();
        double valortotal = valorunidade * kits ;
        System.out.printf("Caro Bill Gates, o valor da compra dos Kits LEGO ficou apenas R$"+valortotal+".");
        
        
        
        
    }
}
