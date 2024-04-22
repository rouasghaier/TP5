/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ex1;

/**
 *
 * @author rouas
 */


public interface MachineLearningModel {
    void train(Dataset dataset);
    double predict(Dataset dataset);

    public static class Dataset {

        public Dataset() {
        }
    }
    
}
