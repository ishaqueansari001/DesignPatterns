package com.ishaque.design.pattern.structural.bridge;

import java.util.HashMap;

public class UPIMobileAccountTransfer implements AccountTransfer{

    HashMap<String,Integer> accountAmount= new HashMap<>();
    public UPIMobileAccountTransfer(){
        accountAmount.put("9028223317",5000);
        accountAmount.put("9028223318",100);
        accountAmount.put("9028223319",2000);
    }


    @Override
    public boolean verifySender(String from) {
        return !accountAmount.containsKey(from);
    }

    @Override
    public boolean verifyReciever(String to) {
        return !accountAmount.containsKey(to);
    }

    @Override
    public boolean checkBalanceisMore(String from,Integer amount) {
        Integer balance = accountAmount.get(from);
        if (balance < amount) {
            return false;
        }
        return true;
    }

    @Override
    public void deductAmount(String from, Integer amount) {
        Integer fromBalance=accountAmount.get(from);
        accountAmount.put(from,fromBalance-amount);

    }

    @Override
    public void sendAmount(String to, Integer amount) {
        Integer toBalance=accountAmount.get(to);
        accountAmount.put(to,toBalance+amount);


    }
}
