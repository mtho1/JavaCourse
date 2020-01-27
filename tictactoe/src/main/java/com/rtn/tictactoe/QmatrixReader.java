/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rtn.tictactoe;

import java.util.Scanner;
import java.lang.Math; 
import java.io.File;
import java.io.FileNotFoundException;


/**
 *
 * @author Micha
 */
public class QmatrixReader {
    final int QmatrixSize =(int) Math.pow(3,9); //3^9
    private Scanner fileScanner;
   
    File inputFile;
    public QmatrixReader(String fileName)
    {
        inputFile = new File(fileName);

    }
    public double [] readData() {
        double[] Qmat = new double[QmatrixSize];
        try
        {
            fileScanner = new Scanner(inputFile, "UTF8");
            int count = 0;
            while (fileScanner.hasNextLine() && count<QmatrixSize)
            {
                double val = fileScanner.nextDouble();
                Qmat[count++] = val;               
            }
            return Qmat;
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            return Qmat;
        }
        
    }
}
