
import java.util.ArrayList;
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
public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> facilitys;
    public StorageFacility(){
        facilitys=new HashMap<>();
    }
    public void add(String unit, String item){
        this.facilitys.putIfAbsent(unit, new ArrayList<>());

        if (facilitys.containsKey(unit)) {
            ArrayList<String> completed = this.facilitys.get(unit);
            completed.add(item);
        }
    }
    public ArrayList<String> contents(String storageUnit){
        ArrayList<String> newa = new ArrayList<>();
        if (facilitys.containsKey(storageUnit)) {
            newa = this.facilitys.get(storageUnit);
            return newa;
        } else {
            return newa;
        }
    }
    
    public void remove(String storageUnit, String item) {
        if (facilitys.containsKey(storageUnit)) {
            ArrayList<String> completed = this.facilitys.get(storageUnit);
            completed.remove(item);
            
            if(completed.isEmpty()){
               facilitys.remove(storageUnit);
            }
        }
    }
    public ArrayList<String> storageUnits(){
        ArrayList<String> newa = new ArrayList<>();
        for(String storageUnit:facilitys.keySet()){
            if(!storageUnit.isEmpty()){
                newa.add(storageUnit);      
            }
        }
        return newa;
    }
}