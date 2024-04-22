/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author rouas
 */
public class NeuralNetwork extends BaseModel {
     private int[] layers;
     private String activationFunction;
     
     public NeuralNetwork(String name, int version, String description, int[] layers, String activationFunction) {
        super(name, version, description);
        this.layers = layers;
        this.activationFunction = activationFunction;
    }

    @Override
    void displayDetails() {
       System.out.println("Name: " + name);
        System.out.println("Version: " + version);
        System.out.println("Description: " + description);
        System.out.println("Device: " + device);
    }

    @Override
    public void train(Dataset dataset) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double predict(Dataset dataset) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void train(ClassificationDataset classificationData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String predict(ClassificationDataset classificationData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
