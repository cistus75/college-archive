import java.io.*;

public class Example04 {
    public static void main(String[] args) {
        try {
            File file = new File("example03");
            if (!file.exists())
                file.createNewFile();
            FileInputStream fis = new FileInputStream(file);
            int i = 0;

            while ((i = fis.read()) != -1) {  
                System.out.print((char) i);
            }
            fis.close();
            System.err.println("파일 읽기 성공");
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
