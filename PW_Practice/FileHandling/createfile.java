import java.io.*;
public class createfile{
    public static void main(String[] args) {
        File dir=new File("pw");
        dir.mkdir();
        File file= new File(dir,"myfile2.txt");
        System.out.println(file.exists());
        try{
            file.createNewFile(); }
            catch(Exception e){
                System.out.println("error...");
            }
            System.out.println(file.exists());
    }
}