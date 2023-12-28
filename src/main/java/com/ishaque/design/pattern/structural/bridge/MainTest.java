package com.ishaque.design.pattern.structural.bridge;

public class MainTest {

    public static void main(String[] args) {
        AccountTransfer transfer= new UPIMobileAccountTransfer();
        BalanceTransfer balanceTransfer= new MobileAppBalanceTransfer(transfer);
        balanceTransfer.transfer("9028223317","9028223318",100);
        balanceTransfer.transfer("9028223318","9028223317",1000);
    }
}
