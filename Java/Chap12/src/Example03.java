import java.io.*;

public class Example03 {
    public static void main(String[] args) {
        try {
            File file = new File("example03.txt");
            if (!file.exists()) 
                file.createNewFile();
            FileWriter myWriter = new FileWriter(file);

            myWriter.write("Hello!! \n");
            myWriter.write("Java programming");
            myWriter.close();
            System.out.println("파일 쓰기 성공");
        } catch (IOException e) {
            e.getMessage();
        }
    }
    
}
