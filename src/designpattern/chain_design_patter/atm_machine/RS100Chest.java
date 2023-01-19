package designpattern.chain_design_patter.atm_machine;

import kotlin.contracts.CallsInPlace;

public class RS100Chest implements CurrencyChestChain{
    private CurrencyChestChain currencyChestChain;

    @Override
    public void setNextCUrrencyChain(CurrencyChestChain currencyChestChain) {
        this.currencyChestChain =currencyChestChain;
    }

    @Override
    public void moneyWithDrawn(AmountWithdrawn amountWithdrawn) {
        if (amountWithdrawn.getAmount() < 100){
            System.out.println("Amount can't be withdrawn");
        }
//        System.out.println("Amount can't be withdrawn");
    }
}
