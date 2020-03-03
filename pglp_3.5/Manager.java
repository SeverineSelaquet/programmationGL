package com.alaa;
public class Manager extends allEmploye{
    private final int base=1500;
    private int NombressEmployes;
    public Manager (int NombresEmployes){
        this.NombresEmployes = NombresEmployes;
    }
    @Override
    public double salaire(){
        return base +(NombresEmployes*100);
    }

}
