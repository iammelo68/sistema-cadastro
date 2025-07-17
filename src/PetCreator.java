import java.io.*;
import java.util.Scanner;
import Exception.*;

public class PetCreator {
    public Pet petCreate() {
        Pet pet = new Pet();
        File formFile = new File("docs\\formulario.txt");
        Scanner sc = new Scanner(System.in);
        try {
            FileReader fr = new FileReader(formFile);
            BufferedReader br = new BufferedReader(fr);
            System.out.println(br.readLine()); // Qual o nome e sobrenome do pet?
            pet.setPetName(sc.nextLine());

            System.out.println(br.readLine()); // Qual o tipo do pet (Cachorro/Gato)?
            String typeString = sc.nextLine();
            if(typeString.equalsIgnoreCase("cachorro")) {
                pet.setPetType(PetType.DOG);
            }
            else if(typeString.equalsIgnoreCase("gato")) {
                pet.setPetType(PetType.CAT);
            }

            System.out.println(br.readLine()); //Qual o sexo do animal?
            String sexString = sc.nextLine();
            if(sexString.equalsIgnoreCase("macho")) {
                pet.setPetSex(PetSex.MALE);
            }
            else if (sexString.equalsIgnoreCase("femea")) {
                pet.setPetSex(PetSex.FEMALE);
            }

            System.out.println(br.readLine()); //Qual endereço que ele foi encontrado?
            System.out.println(br.readLine()); //Numero
            pet.setAddressNumber(sc.nextLine());
            System.out.println(br.readLine()); //Cidade
            pet.setAddressCity(sc.nextLine());
            System.out.println(br.readLine()); //Rua
            pet.setAddressStreet(sc.nextLine());

            System.out.println(br.readLine()); // 5 - Qual a idade aproximada do pet?
            int age = sc.nextInt();
            if (age<20) {
                pet.setPetAge(age);
            }
            else {
                throw new InvalidAgeException("A idade deve ser menor que 20");
            }

            System.out.println(br.readLine()); // 6 - Qual o peso aproximado do pet?
            float weight = sc.nextFloat();
            if (weight<60 || weight>0.5) {
                pet.setPetWeight(weight);
            }
            else {
                throw new InvalidWeightException("O peso deve ser maior que 0.5kg e menor que 60kg");
            }

            System.out.println(br.readLine()); // 7 - Qual a raça do pet?
            sc.nextLine();
            pet.setPetRace(sc.nextLine());




        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (InvalidWeightException e) {
            e.printStackTrace();
        }

        return pet;
    }
}
