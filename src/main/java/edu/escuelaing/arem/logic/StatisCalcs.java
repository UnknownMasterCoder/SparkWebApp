package edu.escuelaing.arem.logic;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class StatisCalcs 
{
    public static LinkedList col = new LinkedList();
    //public static LinkedList col_2 = new LinkedList();
    //public static LinkedList col_2 = new LinkedList();
    public static double med_1;
    public static double med_2;
    public static double desEst_1;
    public static double desEst_2;
    
    public static void main( String[] args ) throws IOException
    { 
        //med_1 = media(col_1);
        //med_2 = media(col_2);
        //desEst_1 = desEstandar(col_1);
        //desEst_2= desEstandar(col_2);
        
        System.out.println("Promedio 1: "+med_1);
        System.out.println("Promedio 2: "+med_2);
        System.out.println("Desv Estandar 1: "+desEst_1);
        System.out.println("Desv Estandar 2: "+desEst_2);
    }
    
    public static double media(LinkedList set){
        double med, sum = 0.0;
        for (int i = 0; i < set.getSize(); i++){
            sum += set.getNode(i);
        }
        med = sum/set.getSize();
        //Convierte el promedio a solo dos cifras decimales
        String decimalTemp = String.format("%.2f", med);
        med = Double.parseDouble(decimalTemp);
        
        return med;
    }
    
    public static double desEstandar(LinkedList set){
        double desEst, sum = 0.0;
        double med = media(set);
        for (int i = 0; i < set.getSize(); i++){
            sum += Math.pow(set.getNode(i)-med,2);
        }
        desEst = Math.sqrt(sum/(set.getSize()-1));
        //Convierte el promedio a solo dos cifras decimales
        String decimalTemp = String.format("%.2f", desEst);
        desEst = Double.parseDouble(decimalTemp);
        
        return desEst;
    }
    
    public static LinkedList readInput(String set) {
        
        col.clear();
        for (String singleString: set.split(" ")){
            Double singleNumber = Double.parseDouble(singleString);
            col.insertEnd(singleNumber);
        }
        
        return col;
    }
}
