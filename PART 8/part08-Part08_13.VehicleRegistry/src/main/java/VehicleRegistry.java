
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
public class VehicleRegistry {

    private HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        owners = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {

        if (owners.containsKey(licensePlate)) {
            return false;
        } else {
            owners.put(licensePlate, owner);
            return true;
        }

    }

    public String get(LicensePlate licensePlate) {
        
        for(LicensePlate licensePlate1:owners.keySet()){
            
             if (licensePlate1.equals(licensePlate)){
                 return owners.get(licensePlate);
             }
            
        }
        
        
            return null;
        
    }

    public boolean remove(LicensePlate licensePlate) {
        if (owners.containsKey(licensePlate)) {
            owners.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }
    
    public void printLicensePlates(){
        for(LicensePlate licensePlate:owners.keySet()){
            System.out.println(licensePlate.toString());
        }
    }
    
    public void printOwners(){
        ArrayList<String> listowner=new ArrayList<>();
        for(String owner:owners.values()){
            if(!listowner.contains(owner))
            {
                 listowner.add(owner);
            }   
        }
        for(String owner:listowner){
            System.out.println(owner);
        }
        
    }
    
     public int hashCode(){  
            return this.hashCode();
    }
}
