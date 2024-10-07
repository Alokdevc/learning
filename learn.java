import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class learn{


    public static void main(String args[])
    {
        System.out.println("This is java learning ");
        
        try(FileWriter writer = new FileWriter("C:/Users/Alok singh/Desktop/Learning/sample.txt"))
        {
            writer.write("we are learning file handling in java ");
            writer.write("with help of file handling we are adding lines");
        }catch(IOException e){
            System.out.println("file hi nhi mila mai kya karun");

        }

        
    }
}