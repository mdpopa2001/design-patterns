package com.sample.challenge.bridge;

public abstract class FinancialDocument {
    protected IPrinter printer;

    public FinancialDocument(IPrinter printer) {
        this.printer = printer;
    }

    public abstract void print();
}
