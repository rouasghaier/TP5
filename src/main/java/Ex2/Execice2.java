/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author rouas
 */
import java.io.FileNotFoundException;

public class Execice2 {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        MathOperations mathOperations = new MathOperations();
        UserValidator userValidator = new UserValidator();
        try {
            fileManager.readFile("invalid/file/path.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }
        try {
            mathOperations.calculateFactorial(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }
        try {
            mathOperations.calculateSquareRoot(-10);
        } catch (ArithmeticException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }
        try {
            userValidator.validateAge(16);
        } catch (UserAgeException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }
    }
}
