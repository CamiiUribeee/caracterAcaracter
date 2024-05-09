

package com.mycompany.caracteracaracter;

import java.io.FileReader;
import java.io.IOException;

public class CaracterAcaracter {

    public static void main(String[] args) throws IOException {
        System.out.println("");
        
        String path = "./data.txt"; 
        FileReader fileReader = null; 
        
        try{
            fileReader = new FileReader(path); 
            int value = fileReader.read(); 
            while (value != -1){
                System.out.println((char)value); //esto es un casting
                value = fileReader.read();   //me trae el nuevo valor 
            }
        } catch (IOException e){
            System.out.println("Ha ocurrido un error");
        } finally{
            if (fileReader != null){
                fileReader.close();
            }
        }
        
    }
    
    
    
    
    
}
