/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rtn.tictactoe;

/**
 * Marker: This class is for an "X" or "O" marker in TicTacToe
 * @author 
 */
public class Marker {
    private String sym;
    private Boolean symbolSet;
    public Marker()
    {
        this.symbolSet = false;
        this.sym = "-";        
    }
    public void setsymX()
    {
         if (this.symbolSet ==false)
        {
            sym = "X";
            symbolSet = true;
        }
        else
        {
            throw new IllegalStateException("Marker symbol previously set");
        }
        
    }
    public void setsymO()
    {
        if (!symbolSet)
        {
            sym = "O";
            symbolSet = true;
        }
        else
        {
            throw new IllegalStateException("Marker symbol previously set");
        }
        
    }
    public String getSym()
    {
            return sym;
    }
    public Boolean isSet()
    {
        return symbolSet;
    }
    
}