package org.chinOfResponsibility;

public class Main {
    public static void main(String[] args) {
        discount discount = new discount();
        DriverTip driverTip = new DriverTip();
        DiliveryCharge diliveryCharge =new DiliveryCharge();

        diliveryCharge.successor(driverTip);
        driverTip.successor(diliveryCharge);
        Dilivery dilivery1=new Dilivery(1,350.34);
        System.out.println(DiliveryCharge.applyDiliveryCharge(dilivery1));
        Dilivery dilivery2=new Dilivery(3,550.34);
        System.out.println(DiliveryCharge.applyDiliveryCharge(dilivery2));
        Dilivery dilivery3=new Dilivery(4,1350.34);
        System.out.println(DiliveryCharge.applyDiliveryCharge(dilivery3));
        Dilivery dilivery4=new Dilivery(5,3350.34);
        System.out.println(DiliveryCharge.applyDiliveryCharge(dilivery4));
    }

}