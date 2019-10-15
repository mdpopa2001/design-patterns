package com.sample.challenge.bridge;

import com.sample.challenge.bridge.entities.ClientInvoice;
import com.sample.challenge.bridge.entities.ProviderInvoice;

public interface IPrinter {
    void print(ClientInvoice clientInvoice);
    void print(ProviderInvoice clientInvoice);
}
