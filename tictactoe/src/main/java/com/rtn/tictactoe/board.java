/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rtn.tictactoe;

/**
 *
 * @author Micha
 */
public class board {
    private Marker[][] MarkerArray;
    public board()
    {
        MarkerArray = new Marker[3][3];
        for (int i =0;i<3;i++)
            for (int j =0;j<3;j++)
            {
                MarkerArray[i][j] = new Marker();
            }            
    }
    public Boolean placeMarker(int row,int col,Marker MarkerToPlace)
    {
        if (row <0 || col<0 || row >2 || col>2)
        {
            return false;
        }
        if (MarkerArray[row][col].isSet())
        {
            return false;
        }
        MarkerArray[row][col] = MarkerToPlace;
        return true;
    }
    public void display()
    {
        System.out.println("");
                
        for (int i =0;i<3;i++)
        {
            System.out.println(MarkerArray[i][0].getSym() + " | " + MarkerArray[i][1].getSym() + " | " + MarkerArray[i][2].getSym());            
        }
        System.out.println("");
    }
    
}
    
   
            
    

