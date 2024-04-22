/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author rouas
 */
public class MathOperations {
    public int calculateFactorial(int n){
        if (n<0){
          throw new IllegalArgumentException("le nombre négatif :" +n );
    }
        int fact = 1;
        for (int i = 1; i<= n ; i++){
            fact *=i;
        }
        return fact;
    }
    public double calculateSquareRoot(double n){
        if (n < 0){
            throw new ArithmeticException ("Tentative de calcul de la racine carré d'un nombre négatif:" + n);
            
        }
        return Math.sqrt(n);
    }

    
}
