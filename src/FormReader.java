import java.io.*;

public class FormReader {
    public static void main(String[] args) {
        File formFile = new File("C:\\Users\\iamsm\\IdeaProjects\\SistemaCadastros\\docs\\formulario.txt");

            try {
                FileReader fr = new FileReader(formFile);
                BufferedReader br = new BufferedReader(fr);
                String line;

                while ((line=br.readLine())!=null) {
                    System.out.println(line);
                }

            } catch (IOException e) {
                e.printStackTrace();

        }
    }
}
