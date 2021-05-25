
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ShoppingCart {
    private Map<String, Item> cartItems;
    public ShoppingCart(){
        cartItems=new HashMap<>();
    }
    public void add(String product, int price){
        
        if(cartItems.containsKey(product)){
            Item it=cartItems.get(product);
            it.increaseQuantity();
        }else{
            cartItems.put(product, new Item(product,1,price));
        }
        
        
    }
    public int price(){
        int total=0;
        for(Item it:cartItems.values()){
            total+=it.price();
        }
        return total;
    }
    public void print(){
        for(Item it:cartItems.values()){
            System.out.println(it);
        }
    }
    
}
