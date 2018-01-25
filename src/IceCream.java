/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liam van der watt
 */
public class IceCream extends DessertItem {
    private int cost;
    private String name;
    public IceCream(String name, int cost) {
        super (name);
        this.name = name;
        this.cost= cost;
    }
@Override
    public String toString() { 
    String output =name;
    int iceC= cost;
    String sCost =DessertShoppe.cents2dollarsAndCents(iceC);
        for(int i=0; i < DessertShoppe.RECEIPT_WIDTH -name.length()- sCost.length(); i++) {
            output += " ";
            }
        output+= DessertShoppe.cents2dollarsAndCents(cost);
      
       
        return output;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
