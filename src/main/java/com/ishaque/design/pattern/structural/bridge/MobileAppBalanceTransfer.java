package com.ishaque.design.pattern.structural.bridge;

public class MobileAppBalanceTransfer implements BalanceTransfer {
    AccountTransfer accountTransfer;

    MobileAppBalanceTransfer(AccountTransfer transfer){
        this.accountTransfer=transfer;

    }

    @Override
    public boolean transfer(String from, String to, Integer amount) {
       if( accountTransfer.verifyReciever(to)){
           throw new IllegalArgumentException("to number is not a bank mobile no");
       }
        if( accountTransfer.verifySender(from)){
            throw new IllegalArgumentException("from number is not a bank mobile no");
        }
        if( !accountTransfer.checkBalanceisMore(from,amount)){
            throw new IllegalArgumentException("amount is greater than balance, not able to send");
        }
        accountTransfer.deductAmount(from,amount);
        accountTransfer.sendAmount(to,amount);
        System.out.println("amount transfered from "+from+" to "+to+" of amount "+amount);
        return true;
    }
}
