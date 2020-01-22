/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rtn.tictactoe;

/**
 *
 * @author 
 */
public class unitTest_marker {
    public static void main(String [] args)
    {
        Marker myMarkerX = new Marker();
        myMarkerX.setsymX();
        System.out.println("n "+myMarkerX.getSym()); // Display the string.
        
        Marker myMarkerO = new Marker();
        myMarkerO.setsymO();
        System.out.println(myMarkerO.getSym()); // Display the string.
        
    }
    
    
}