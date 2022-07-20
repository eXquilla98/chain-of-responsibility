package org.chinOfResponsibility;

public class Dilivery {

    private double price;
    private double diliveryCharge;
    private int orderID;
    private String food;
protected void setDiliveryCharge(double diliveryCharge)
{
    this.diliveryCharge = diliveryCharge;
}
public Dilivery(int orderID,double price){

    this.orderID= orderID;
    this.price=price;

}

    public double getPrice() {
        return price;
    }

    public double getDiliveryCharge() {
        return diliveryCharge;
    }

    public int getOrderID() {
        return orderID;
    }

}

