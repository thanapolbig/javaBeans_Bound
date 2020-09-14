/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundproperty;

import java.util.Scanner;

/**
 *
 * @author thana
 */
public class BoundProperty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyBean mysource = new MyBean();
        Listener1 listener1 = new Listener1();
        Listener2 listener2 = new Listener2();
        mysource.addPropertyChangeListener(listener1);
        mysource.addPropertyChangeListener(listener2);
        Scanner sn = new Scanner(System.in);
        while(true){
            System.out.print("enter score : ");
            String input = sn.nextLine();
            if(input.equals("")){
                break;
            }else{
                mysource.setFootballScore(input);
            }
            
        }
    }
    
}
