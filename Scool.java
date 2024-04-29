import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = "";
        int idade = 0;
        Float nota, nota2,nota3;
        int i = 0;
        float SomaNotas = 0;

        System.out.print("insira seu Nome:");
        nome = scan.nextLine();
        System.out.print("insira sua idade:");
        idade = scan.nextInt();

            System.out.println("insira a 1 nota");
            nota = scan.nextFloat();
            System.out.println("insira a 2 nota");
            nota2 = scan.nextFloat();
            System.out.println("insira a 3 nota");
            nota3 = scan.nextFloat();
            clearScreen();
            SomaNotas = (nota + nota2+ nota3)/3;
            System.out.println(SomaNotas);
            System.out.println(" o nome do aluno é: "+ nome+ "\na idade do aluno é: "+idade);
            System.out.println( " a media do aluno(a)"+SomaNotas);
            if (SomaNotas >= 7) {
                System.out.println("o Aluno(a) está aprovado(a)");
            }else{

                System.out.println("o aluno esta Reprovado!");
            }
      
   

    }
}
  
