package org.chinOfResponsibility;

public  class DriverTip extends Handler {
    @Override
    public double applyDiliveryChrge(Dilivery dilivery) {
        dilivery.setDiliveryCharge(dilivery.getDiliveryCharge() * 0.15);
        System.out.println("Dilivery tip : ");
        if ((dilivery.getDiliveryCharge() <= 100))
        {return dilivery.getDiliveryCharge();}
        else{

            return successor.applyDiliveryChrge(dilivery);
        }




    }

    @Override
    public double applyDiliveryCharge(Dilivery dilivery) {
        return 0;
    }

    @Override
    public void successor(DriverTip driverTip) {

    }

    @Override
    public void successor(DiliveryCharge diliveryCharge) {

    }
}
