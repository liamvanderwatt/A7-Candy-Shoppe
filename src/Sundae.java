/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liam van der watt
 */
public class Sundae extends IceCream {
private String toppingName;
private int toppingCost;
private int cost;
private String name;
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        super (icName,icCost);
        this.name = icName;
        this.cost= icCost;
        this.toppingName=toppingName;
        this.toppingCost=toppingCost;
    }
@Override
    public String toString() {
    String output =toppingName+" Sundae with"+"\n";
           output+=name;
    int Scost = this.getCost();
    String sCost =DessertShoppe.cents2dollarsAndCents(Scost);
        for(int i=0; i < DessertShoppe.RECEIPT_WIDTH -this.name.length()- sCost.length(); i++) {
            output += " ";
            }
        output+= DessertShoppe.cents2dollarsAndCents(Scost);
        
        return output;
    }
@Override
public int getCost(){
    int sale = cost+toppingCost;
    return sale;
}
}
