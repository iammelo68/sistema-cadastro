import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PetStoreKeeper {
    public void petStore(Pet pet){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmm");
        String now = LocalDateTime.now().format(format);
        File file = new File("petsCadastrados//"+now+pet.getPetName().replaceAll("\\s+","").toUpperCase()+".txt");
        try {
            boolean isCreated = file.createNewFile();
            if (isCreated) {System.out.println("Registrado com sucesso");}

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("1- "+pet.petName);
            bw.newLine();
            bw.write("2- "+pet.petType);
            bw.newLine();
            bw.write("3- "+pet.petSex);
            bw.newLine();
            bw.write("4- "+pet.addressNumber +", "+ pet.addressCity + ", "+ pet.addressStreet);
            bw.newLine();
            bw.write("5- "+pet.petAge+" anos");
            bw.newLine();
            bw.write("6- "+pet.petWeight+"kg");
            bw.newLine();
            bw.write("7- "+pet.petRace);

            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
