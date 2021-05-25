/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class CD implements Packable{
    private String artist ;
    private String name;
    private int year;
    public CD(String a,String n,int w){
        artist=a;
        name=n;
        year=w;
    }
    public double weight(){
        return 0.1;
    }
    public String toString(){
        return artist+": "+name+" ("+year+")";
    }
}
