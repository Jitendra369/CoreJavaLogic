package designpattern.chain_design_patter.atm_machine;

public interface CurrencyChestChain {

    public void setNextCUrrencyChain(CurrencyChestChain currencyChestChain);
    public void moneyWithDrawn(AmountWithdrawn amountWithdrawn);
}
