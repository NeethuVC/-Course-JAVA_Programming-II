
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
public class OneItemBox extends Box {

    private ArrayList<Item> itemone;
    public OneItemBox() {
        itemone=new ArrayList<>();
    }

    public void add(Item item) {
      if(itemone.size()==0){
          itemone.add(item);
      }
    }

    public boolean isInBox(Item item) {
        if(itemone.size()>0){
             if(itemone.get(0).equals(item)){
            return true;
        }
        return false;
        }
        return false;
    }

}
