package com.beans;

public class ATM {
    private IPrinter iprinter;
    ATM(IPrinter ip){
        this.iprinter=ip;
    }

    public void setIprinter(IPrinter iprinter) {
        this.iprinter = iprinter;
    }

    public void withdraw(){
        iprinter.print();
    }
}
