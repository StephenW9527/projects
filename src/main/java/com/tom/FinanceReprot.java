package com.tom;

public class FinanceReprot implements  Report {

    @Override
    public void load() {
        System.out.println("Finance loading data");
    }

    @Override
    public void print() {
        System.out.println("Finance printing");
    }
}
