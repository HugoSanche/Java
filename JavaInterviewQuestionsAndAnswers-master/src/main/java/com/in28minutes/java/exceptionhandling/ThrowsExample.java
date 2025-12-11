package com.in28minutes.java.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample{

    public void readFile(String name) throws FileNotFoundException, IOException
    {
        FileReader file=new FileReader(name);

        file.close();
    }

    public static void main(String[] args) {
        ThrowsExample throwsExample=new ThrowsExample();
        try {

            throwsExample.readFile("sofia.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("Error: "+e);
        }
        catch (IOException ioException){
            System.out.println("Error:"+ioException );
        }

    }
}
