package com.alaa
public class vendeur extends allEmploye{
    final private int base = 2000;
    private int commision;
    public vendeur (int commision){
        this.commision = commision;
    }
    @Override
    public double salaire(){
    return base+commision;
    }
}
