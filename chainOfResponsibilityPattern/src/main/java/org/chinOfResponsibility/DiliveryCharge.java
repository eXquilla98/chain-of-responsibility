package org.chinOfResponsibility;

public class DiliveryCharge extends Handler{
    @Override
    public double applyDiliveryChrge(Dilivery dilivery) {
        return 0;
    }

    @Override
    public static double applyDiliveryCharge(Dilivery dilivery){

        return successor.applyDiliveryCharge(dilivery);
    }

    @Override
    public void successor(DriverTip driverTip) {

    }

    @Override
    public void successor(DiliveryCharge diliveryCharge) {

    }

}
