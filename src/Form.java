import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Form {

    File formFile = new File("C:\\Users\\iamsm\\IdeaProjects\\SistemaCadastros\\docs\\formulario.txt");

    public void formFiller() {
        String [] formResponses = new String[10];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        try {
            FileReader fr = new FileReader(formFile);
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line=br.readLine())!=null) {
                System.out.println(line);
                formResponses[count] = sc.nextLine();
                count++;
            }


        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
