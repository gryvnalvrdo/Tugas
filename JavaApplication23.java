/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

/**
 *
 * @author alver
 */
public class JavaApplication23
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        for (int i = 2; i <= 200; i+=2)
        {
            if (i%3==0)
            {
                continue;
               
            }
            System.out.print(i + " ");
        }
    }
    
}
