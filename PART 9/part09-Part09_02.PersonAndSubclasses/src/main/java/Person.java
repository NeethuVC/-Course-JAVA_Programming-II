/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Person {
    private String a;
    private String b;
    public Person(String x,String y){
        a=x;
        b=y;
    }
    public String toString(){
        return a+"\n  "+b;
    }
}
