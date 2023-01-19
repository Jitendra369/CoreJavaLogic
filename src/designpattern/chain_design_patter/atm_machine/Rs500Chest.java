package designpattern.chain_design_patter.atm_machine;

public class Rs500Chest implements  CurrencyChestChain{

    private CurrencyChestChain currencyChestChain;

    @Override
    public void setNextCUrrencyChain(CurrencyChestChain currencyChestChain) {
        this.currencyChestChain = currencyChestChain;
    }

    @Override
    public void moneyWithDrawn(AmountWithdrawn amountWithdrawn) {
        if (amountWithdrawn.getAmount() >= 500){
            System.out.println("amount with drawn 500");
        }
        currencyChestChain.moneyWithDrawn(amountWithdrawn);
    }
}
