/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author rouas
 */
abstract class BaseModel implements MachineLearningModel {
    protected String name;
    protected int version;
    protected String description;
    protected String device = "cpu";

    public BaseModel(String name, int version, String description) {
        this.name = name ;
        this.version = version ;
        this.description = description ;
    }

    abstract void displayDetails() ; 
    
}