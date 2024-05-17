import java.util.Scanner;

public class App {
    public static void main(String[] args) {
      
    Scanner scan= new Scanner(System.in);
    float soma= 0, res = 0, media= 0;
    int i= 1;
    
    float[] number= new float [9];

    for (int cont = 1; cont < 9; cont++) {
        System.out.println("insira um valor: ");
        number[cont] = scan.nextInt();
        media = (media +number[cont]) /8;
        soma = soma + number[cont];
    }
    while (i< 9) {
       System.out.println("o valor do " +i+ "é" + number[i]); 
       i++;
    }

    System.out.println("o valor da média é: "+media);
    System.out.println("\n a soma dos valores é: "+soma);
    

    }

}
