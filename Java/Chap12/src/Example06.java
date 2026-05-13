import java.io.*;

public class Example06 {
    public static void main(String[] args) {
        try {
            File file = new File("example03.txt");
            if (!file.exists()) 
                file.createNewFile();

            FileReader fis  = new FileReader(file);
            BufferedReader br = new BufferedReader(fis);

            String str;
            while ((str = br.readLine()) != null) {  
                System.out.println(str);                
            }
            fis.close();
            System.out.println("파일 읽기 성공"); 
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
