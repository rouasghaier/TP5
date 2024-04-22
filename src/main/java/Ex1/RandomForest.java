/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author rouas
 */
public class RandomForest extends BaseModel {
  private int numTrees;
  private int maxDepth;
  
  public RandomForest(String name , int version , String description, int numTrees, int maxDepth){
      super (name,version,description);
      this.numTrees= numTrees;
      this.maxDepth= maxDepth;
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

    void train(RegressionDataset regressionData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String predict(RegressionDataset regressionData) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
