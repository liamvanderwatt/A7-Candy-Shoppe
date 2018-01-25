/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liam van der watt
 */
public class Cookie extends DessertItem {
    private int number;
    private int pricePer12;
    private String name;
    public Cookie(String name, int number, int pricePer12) {
        super (name);
        this.name = name;
        this.number = number;
        this.pricePer12 = pricePer12;
    }
@Override
    public String toString() {
    String output = number+"";
        output+=" @ $"+DessertShoppe.cents2dollarsAndCents(pricePer12)+" /dz"+"\n";
        output+=name;
        int cok = this.getCost();
        String sCost = DessertShoppe.cents2dollarsAndCents(cok);
        for(int i=0; i < DessertShoppe.RECEIPT_WIDTH -name.length()- sCost.length(); i++) {
            output +=" ";
            
            }
        output+= DessertShoppe.cents2dollarsAndCents(cok)+"";
        return output;
       
    }

    @Override
    public int getCost() {
       int cost = (this.number/12)  * pricePer12;
       return cost;
    }
}
