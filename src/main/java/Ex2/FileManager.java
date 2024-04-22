/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author rouas
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileManager {
    public void readFile(String filePath) throws FileNotFoundException {
        BufferedReader reader ;
        try {
            reader = new BufferedReader ( new FileReader(filePath));
            String line = reader.readLine();
            while (line != null){
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        }catch (FileNotFoundException e){
            throw new FileNotFoundException("le fichier est non trouvé : "+ filePath);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
