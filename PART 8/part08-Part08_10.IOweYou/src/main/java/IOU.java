
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class IOU {
    
    private HashMap<String,Double> allSightings;
    
    public IOU(){
        allSightings=new HashMap<>();
    }
    public void setSum(String toWhom, double allSightings){
       
        this.allSightings.put(toWhom,allSightings);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        
         if(this.allSightings.containsKey(toWhom)){
             return allSightings.get(toWhom);
         }else{
             return 0;
         }
        
    }
}
