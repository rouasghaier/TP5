/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author rouas
 */
public abstract class Dataset {
    protected boolean isTrain ;
    protected String path ;
    
    abstract void loadData();
    abstract void preprocessData();
}
