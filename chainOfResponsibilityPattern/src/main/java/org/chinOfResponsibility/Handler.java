package org.chinOfResponsibility;

public abstract  class Handler {

    protected  Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }


    public abstract double applyDiliveryChrge(Dilivery dilivery);

    public abstract double applyDiliveryCharge(Dilivery dilivery);

    public abstract void successor(DriverTip driverTip);

    public abstract void successor(DiliveryCharge diliveryCharge);
}
