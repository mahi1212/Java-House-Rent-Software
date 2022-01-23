import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ShowInfo {

    void writeUniversitytInfo(String UniversityName,String unit, int sub){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter
                    ("C:\\Users\\Mahi\\OneDrive\\Desktop\\Test\\Result\\universityInput.txt"));
            bw.write("University Selected : " + UniversityName +"\n");
            bw.write("Unit Selected : " + unit + "\n");
            bw.write("Subject Selected(in number) : " + sub + "\n");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
