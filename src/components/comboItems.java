/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

/**
 *
 * @author ACT
 */
public class comboItems {
    
    private int id;
    private String value;
    
    public comboItems(int id, String value){
        this.id = id;
        this.value = value;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getValue(){
        return value;
    }
    
    public void setValue(String value){
        this.value = value;
    }
    
}
