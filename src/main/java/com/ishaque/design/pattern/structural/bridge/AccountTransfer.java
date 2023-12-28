package com.ishaque.design.pattern.structural.bridge;

public interface AccountTransfer {


    boolean verifySender(String from);
    boolean verifyReciever(String to);
    boolean checkBalanceisMore(String from, Integer amount);
    void deductAmount(String from, Integer amount);
    void sendAmount(String to, Integer amount);
}
