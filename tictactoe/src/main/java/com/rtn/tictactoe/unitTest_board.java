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
public class unitTest_board {
    public static void main(String [] args)
    {
        board myBoard = new board();
        myBoard.display();
        Marker Xmarker = new Marker();
        Xmarker.setsymX();
        myBoard.placeMarker(1, 1, Xmarker);
        myBoard.display();
        
    }
    
    
}
