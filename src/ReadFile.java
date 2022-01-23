import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile extends ShowInfo{
    void readMyFile(String folderName, String fileName){
        try{
            BufferedReader dept = new BufferedReader(new FileReader
                    ("C:\\Users\\dell laptop\\Desktop\\HouseRentProject\\Admin\\" + folderName + "\\" + fileName + ".txt"));
            String text;
            while ((text = dept.readLine()) != null){
                System.out.println(text);
            }
            dept.close();
        }catch (Exception e){
            return;
        }
    }
}
