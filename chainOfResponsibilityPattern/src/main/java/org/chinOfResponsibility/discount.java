package org.chinOfResponsibility;

public  class discount extends Handler{

    @Override
    public double applyDiliveryChrge(Dilivery dilivery) {
        dilivery.setDiliveryCharge(dilivery.getDiliveryCharge()-(dilivery.getPrice()*0.04));
        System.out.println("Discount calculated");
        return dilivery.getDiliveryCharge();
    }

    @Override
    public double applyDiliveryCharge(Dilivery dilivery) {
        return 0;
    }
}
