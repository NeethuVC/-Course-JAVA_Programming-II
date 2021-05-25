
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Box implements Packable{
    private ArrayList<Packable> items ;
    private double capacity;
    public Box(double cp) {
        this.items = new ArrayList<>();
        capacity=cp;
    }
    public void add(Packable item) {
        
        double total=0;
        for(Packable item1:items){
            total+=item1.weight();
        }
        if(total+item.weight()<=capacity){
            this.items.add(item);
        }
       
    }
    public String toString(){
        double total=0;
        for(Packable item1:items){
            total+=item1.weight();
        }
        return "Box: "+items.size()+" items, total weight "+total+" kg";
    }
    
    public double weight() {
        double weight = 0;
         
        for(Packable item1:items){
            weight+=item1.weight();
        }
        return weight;
    }
    
}
