/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author rouas
 */
public class ClassificationDataset extends Dataset {
    private String[] labels;
    private int numClasses;
    public ClassificationDataset(String path, boolean isTrain){
        this.path = path ;
        this.isTrain = isTrain ;
    }

    @Override
    void loadData() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    void preprocessData() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
}
