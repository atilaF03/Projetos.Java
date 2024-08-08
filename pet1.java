
public class App {
    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.setNome("ragnar ");
        pet.setPorte("grande");
        pet.setAlimentação("carne");
        pet.setIdade(14);
        pet.setRaca("pitbull");

        System.out.println("o nome do pet é " + pet.getNome());
        System.out.println("o porte do cachorro é:" + pet.getPorte());
        System.out.println("a alimentação do cachorro é:" + pet.getAlimentação());
        System.out.println("a idade do cachorro é:" + pet.getIdade() + "meses");
        System.out.println(" a raça do cachorro é" + pet.getRaca());
    }
}
