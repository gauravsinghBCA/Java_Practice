import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class print_writer {
    public static void main(String[] args){
        File dir=new File("pw");
        File file= new File(dir,"myfile2.txt");
        FileWriter fw=null;
        try{
            fw= new FileWriter(file);
        }
        catch(Exception e){
            System.out.println("error");
        }
        PrintWriter pw = new PrintWriter(fw);
        pw.write(89);
        pw.write("\n");
        pw.println("java");
        pw.println(100);
        pw.close();
    }
    
}
