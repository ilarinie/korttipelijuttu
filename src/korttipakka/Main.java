/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package korttipakka;

import java.util.ArrayList;


public class Main {
    
    public static void main(String[] args){
        
        Korttipakka pakka = new Korttipakka();
        ArrayList<Kortti> pakkah = pakka.getPakka();
           
        for (Kortti kortti : pakkah){
            System.out.println(Kortti+"\n");
            
            
        }
        
        
        
    }
    
    
    
}