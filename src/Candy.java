/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liam van der watt
 */
public class Candy extends DessertItem {
    private double weight;
    private int pricePerLbs;
    private String name;

    public Candy(String name, double weight, int pricePerLbs) {
        super (name);
        this.name=name;
        this.weight=weight;
        this.pricePerLbs=pricePerLbs;
    }

    @Override
    public String toString() {
        String output =this.weight +" lbs.";
        
        output+=" @ $"+(DessertShoppe.cents2dollarsAndCents(pricePerLbs))+" /lb."+"\n"; 
        output+= this.name;
        int cost = this.getCost();
        String sCost =DessertShoppe.cents2dollarsAndCents(cost);
        for(int i=0; i < DessertShoppe.RECEIPT_WIDTH -name.length()- sCost.length(); i++) {
            output += " ";
            }
        output+= DessertShoppe.cents2dollarsAndCents(cost);
        
        return output;
    }

    @Override
    public int getCost() {
       double temp = weight * pricePerLbs; 
       int cost = (int)Math.round(temp);
       return cost;
    }
}
