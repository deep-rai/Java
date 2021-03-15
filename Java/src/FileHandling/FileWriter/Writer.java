package FileHandling.FileWriter;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class Writer {
    public void fileWrite(){
        String n=null;
        try{
            FileWriter fw=new FileWriter("C:\\Users\\ddeep\\IdeaProjects\\Java\\src\\FileHandling\\FileWriter\\Writer.txt");
            BufferedWriter bw=new BufferedWriter(fw);
            System.out.println("What is there to be written??");
            Scanner input=new Scanner(System.in);
            n=input.nextLine();
            bw.write(n);
            bw.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
