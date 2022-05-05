package OOPs.Basic;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class HELLOFILE{
    public static void main(String [] args) throws FileNotFoundException{
        File file=new File("Hello.txt");
        Scanner read = new Scanner(file);
        while(read.hasNext()){
            String line = read.nextLine();
            System.out.println(line);
        }
        read.close();
    }

}
