/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universaldatatype;

/**
 *
 * @author Anthony
 */
public class UniversalDatatype {
    public static boolean boolTest1 = true;
    public static String stringTest1 = "potato";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Test1 using changeType...");
        miscDatatype Test1 = new miscDatatype();
        Test1.changeType();
        System.out.println("Test2 using changeTypeAuto");
        miscDatatype Test2 = new miscDatatype();
        Test2.changeType("boolean");
        System.out.println("Testing printType using Test1(fixed Github)2");
        Test1.printType();
    }
    
}
