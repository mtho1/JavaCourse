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
public class unitTest_QmatrixReader {
     public static void main(String [] args)
     {
         System.out.println("Working Directory = " + System.getProperty("user.dir") );
         QmatrixReader myReader = new QmatrixReader(".\\data.txt");
         
         double [] Qmat = myReader.readData();
         for (int k = 0; k<Qmat.length; k++)
         {
             System.out.println(Qmat[k]);
         }
     }

}
