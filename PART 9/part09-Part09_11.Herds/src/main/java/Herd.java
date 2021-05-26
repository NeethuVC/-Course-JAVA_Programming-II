
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Herd implements Movable {
    private List<Movable> herds ;
    public Herd(){
        herds=new ArrayList<>();
        
    }
    public void addToHerd(Movable movable){
        herds.add(movable);
    }
    public void move(int dx, int dy){
        for(Movable mv:herds){
            mv.move(dx, dy);
        }
    }
    public String toString(){
        String v="";
        for(Movable mv:herds){
            v+=mv.toString()+"\n";
        }
         return v;
    }
}
