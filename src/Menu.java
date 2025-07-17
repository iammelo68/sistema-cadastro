import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        PetCreator creator = new PetCreator();
        PetStoreKeeper store = new PetStoreKeeper();
        while (i!=6) {
            System.out.println("Insira a opção desejada: ");
            System.out.println("1. Cadastrar um novo pet");
            System.out.println("2. Alterar os dados do pet cadastrado");
            System.out.println("3. Deletar um pet cadastrado");
            System.out.println("4. Listar todos os pets cadastrados");
            System.out.println("5. Listar pets por algum critério (idade, nome, raça)");
            System.out.println("6. Sair");
            i = sc.nextInt();
            switch (i) {
                case 1:
                    store.petStore(creator.petCreate());
                    break;
                case 2:
                    System.out.println("Alterar os dados");
                    break;
                case 3:
                    System.out.println("Deletar");
                    break;
                case 4:
                    System.out.println("Listar");
                    break;
                case 5:
                    System.out.println("Listar criterios");
                    break;
                case 6:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Número digitado inválido");
            }
        }
    }
}
