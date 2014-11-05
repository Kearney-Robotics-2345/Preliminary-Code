/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universaldatatype;

import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class miscDatatype {
   
    String datatype = "unassigned";
    String newDatatype = "unassigned";
    String oldDatatype = "unassigned";
//Begin code for object "miscDatatype"
    public boolean miscDatatype(String datatype) {
        boolean createdSuccess = true;
        return createdSuccess;
    }
    public void setValue() {
        //Sets value of variable by changing value of byte array
        switch (this.datatype) {
            case "boolean":
                local boolean valueCarrier = UniversalDatatype.boolTest1;
                break;
            case "String":
                String valueCarrier = UniversalDatatype.stringTest1;
                break;
        }
    }
    public void changeType() {
        //Stores value of datatype in oldDatatype for future reference
        oldDatatype = this.datatype;
        System.out.println("Input new datatype (boolean, String, double, int, float) CASE-SENSITIVE- ");
        Scanner inputDatatype = new Scanner(System.in);
        newDatatype = inputDatatype.nextLine();
        this.datatype = newDatatype;
        System.out.println("miscDatatype converted from " + oldDatatype + " to " + this.datatype);
        //Begin long and hopefully optimizable nest of case structures to convert data into byte arrays and back into data? OR is there an alternative?
    }
    //This is the same method as above but instead of user input, newDatatype is set as a parameter for automization
     public void changeType(String newDatatype) {
        oldDatatype = this.datatype;
        this.datatype = newDatatype;
        System.out.println("miscDatatype converted from " + oldDatatype + " to " + this.datatype);
    }
     public void printType() {
         System.out.println("Datatype for this miscDatatype is: " + this.datatype);
     }
}
