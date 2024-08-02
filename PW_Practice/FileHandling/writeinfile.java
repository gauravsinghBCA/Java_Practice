import java.io.*;

public class writeinfile {
  public static void main(String[] args) {
    File dir = new File("pw");
    File file = new File(dir, "myfile2.txt");
    FileWriter fw = null;

    try {
      fw = new FileWriter(file);
      fw.write("java");
      fw.write("\n");
      fw.write(67);
      fw.write("\n");
      fw.write(97);
      // fw.write(50.5);
      fw.close();
    } catch (Exception e) {
      System.out.println("error..");
    }

  }
}
