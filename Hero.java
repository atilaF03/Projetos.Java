import java.util.Random;

public class Hero {
    String nome = "";
    int forca = 10;
    int hp = 100;

    void mostrarStatus() {
        System.out.printf("você tem: %d pontos de vida\n", hp);
    }

    int hitDamage() {
        Random gerador = new Random();
        int dado = 1 + gerador.nextInt(19);
        int dano = forca + dado;
        return dano;
    }

    void ataque(String alvo, String Habilidade, int chance) {
        Random gerador2 = new Random();
        chance = gerador2.nextInt(2);
        if (Habilidade.length() == chance) {
            System.out.printf("vc atacou %s e causou %d ", alvo, forca);
        } else {

            System.out.printf("vc atacou %s e causou %d ", alvo, forca);
        }

    }

    void escudo(String alvo) {
        System.out.printf("Você usou escudo ");
    }

}
