import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolha = 0, contador = 1;

        Hero hero1 = new Hero();

        System.out.println("insira o nome do seu heroi: ");
        hero1.nome = scan.nextLine();
        System.out.printf("aqui está os atributos do seu heroi Player 1 seja bem vindo a batalha %s\n", hero1.nome);
        System.out.printf("a sua força é de: %d\n", hero1.forca);
        System.out.printf("você tem: %d pontos de vida\n", hero1.hp);
        System.out.println("Vamos Lutar");

        do {
            System.out.println("faça sua escolha");
            System.out.println("1 ver o status do personagem");
            System.out.println("2 atacar ");
            System.out.println("3 escudo");
            System.out.println("4bost damage ");
            System.out.println("5 Encerrar turno ");
            escolha = scan.nextInt();

            switch (escolha) {
                case 1:
                    System.out.printf("Status do: %s", hero1.nome);
                    hero1.mostrarStatus();
                    break;
                case 2:
                    System.out.println("Ataque ");
                    hero1.ataque("Shark","ex",1);
                    break;
                case 3:
                    System.out.println("Escudo ");
                    hero1.escudo("Shark");
                    case 4:
                    System.out.println(hero1.hitDamage());
                    break;
                default:
                    break;

            }
        } while (contador != 0);

    }

    public static void limparConsole() {// função limpar tela
        try {
            // Limpa o console de acordo com o sistema operacional
            System.getProperty("os.name").contains("Windows");
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        } catch (Exception e) {
            System.out.println("Erro ao limpar o console: " + e.getMessage());
        }
    }

}
