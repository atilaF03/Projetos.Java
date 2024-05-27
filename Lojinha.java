import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String Id_funcionario = "", Codigo_da_Peça = "";

        Double PrecoDaPeca = 0.0, Vezes = 0.0 ,Preço_total = 0.0, valorPLus = 0.0,sal;

        System.out.println("Nome do vendedor");
        Id_funcionario = scan.nextLine();

        System.out.println("Isira o Código da peça");
        Codigo_da_Peça = scan.nextLine();

        System.out.println("insira o preço da peça ");
        PrecoDaPeca = scan.nextDouble();

        System.out.println("quantas peças foram compradas");
        Vezes = scan.nextDouble();

        Preço_total = PrecoDaPeca * Vezes; // conta a quantidade de para fazer a conta total 
        valorPLus = Preço_total * 0.05;// aplica o desconto 
        sal = Preço_total - valorPLus;// aqui é a comissão do funcionário 

        System.out.println("==========================================");
        System.out.println("o nome do funcionário é: " + Id_funcionario);
        System.out.println("o codigo da peça é: " + Codigo_da_Peça);
        System.out.println("o valor é: " + Preço_total);
        System.out.println("O valor do funcionario é:" + valorPLus);
        System.out.println("quaantidade vendida: " + Vezes);
        System.out.println("==========================================");
    }

}
