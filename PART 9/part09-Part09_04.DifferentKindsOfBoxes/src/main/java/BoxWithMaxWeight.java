/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> items;
    public BoxWithMaxWeight(int capacity){
        this.capacity=capacity;
        items=new ArrayList<>();
       
    }
    public void add(Item item){
        int total=0,i=0;
         while (i < this.items.size()) {
            total+= items.get(i).getWeight();
            i++;
        }
                
        if(total+item.getWeight()<=capacity){
            this.items.add(item);  
        }
       
               
    }
    public  boolean isInBox(Item item){

         int i = 0;
         while (i < this.items.size()) {
            String operationName = this.items.get(i).getName();
           if(operationName.equals(item.getName())){
               return true;
           }
           i++;
        }
        return false; 
    }
    
}
