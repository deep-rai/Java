package FileHandling.FileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public void readFile(){
        String l=null;
        try{
            FileReader fr=new FileReader("C:\\Users\\ddeep\\IdeaProjects\\Java\\src\\FileHandling\\FileReader\\Hello.txt");
            BufferedReader br=new BufferedReader(fr);
            while((l= br.readLine()) != null){
                System.out.println(l);
            }
            br.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
        catch (IOException e) {
            e.printStackTrace();
            }


    }
}
