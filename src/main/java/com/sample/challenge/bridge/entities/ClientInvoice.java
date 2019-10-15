package com.sample.challenge.bridge.entities;

import com.sample.challenge.bridge.FinancialDocument;
import com.sample.challenge.bridge.IPrinter;

public class ClientInvoice extends FinancialDocument {
    public ClientInvoice(IPrinter printer) {
        super(printer);
    }

    @Override
    public void print() {
        this.printer.print(this);
    }
}
