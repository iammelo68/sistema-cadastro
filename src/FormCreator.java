import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FormCreator {
    public static void main(String[] args) {
        File formFile = new File("C:\\Users\\iamsm\\IdeaProjects\\SistemaCadastros\\docs\\formulario.txt");
        try {
            boolean isFormCreated = formFile.createNewFile();
            System.out.println(isFormCreated);
            FileWriter fl = new FileWriter(formFile);
            BufferedWriter bw = new BufferedWriter(fl);
            bw.write("1. Qual o nome e sobrenome do pet?");
            bw.newLine();
            bw.write("2 - Qual o tipo do pet (Cachorro/Gato)?");
            bw.newLine();
            bw.write("3 - Qual o sexo do animal?");
            bw.newLine();
            bw.write("4 - Qual o endereço em que ele foi encontrado?");
            bw.newLine();
            bw.write("4.1 - Número:");
            bw.newLine();
            bw.write("4.2 - Cidade:");
            bw.newLine();
            bw.write("4.3- Rua:");
            bw.newLine();
            bw.write("5 - Qual a idade aproximada do pet?");
            bw.newLine();
            bw.write("6 - Qual o peso aproximado do pet?");
            bw.newLine();
            bw.write("7 - Qual a raça do pet?");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

