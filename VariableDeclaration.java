/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acadgildassignment;

/**
 *
 * @author Parul
 */
public class VariableDeclaration {
    
    public static void main(String[] args)
        {
                
        int a = 20;
        int b = 10;
      // int b = (a--) - (--a); 
       System.out.println("INT b = " +((a--)-(--a)));
        System.out.println("INT c = " +(a--));
        System.out.println("INT d = " +(a>>2));
        System.out.println("INT e = " +(a&b));
    
}
