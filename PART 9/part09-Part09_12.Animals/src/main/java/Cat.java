/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Cat extends Animal implements NoiseCapable{
    public Cat(){
        super("Dog");
    }
    public Cat(String n){
        super(n);
    }
     public void purr(){
        System.out.println(super.getName()+" purrs");
    }
     public void makeNoise(){
       purr();
   }
}
