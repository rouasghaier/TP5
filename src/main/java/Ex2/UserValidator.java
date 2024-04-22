/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author rouas
 */
public class UserValidator {
     public void validateAge(int age) throws UserAgeException {
        if (age < 18) {
            throw new UserAgeException("Âge invalide : " + age + ". L’utilisateur doit être âgé de 18 ans ou plus.");
        }
    }
}
