import java.io.*;
public class readfile {
    public static void main(String[] args) throws IOException {
        File dir = new  File("pw");
        File file = new File(dir,"myfile2.txt");
        FileReader fr= new FileReader(file);
        
        
           
            int i= fr.read();
        
        
    
         while(i!=-1){
            System.out.println(i+"---->");
            System.out.println((char)i);
            i=fr.read();
         }
         fr.close();

    }
}
