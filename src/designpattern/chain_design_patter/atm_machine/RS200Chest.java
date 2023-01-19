package designpattern.chain_design_patter.atm_machine;

public class RS200Chest implements CurrencyChestChain{

    private CurrencyChestChain currencyChestChain;

    @Override
    public void setNextCUrrencyChain(CurrencyChestChain currencyChestChain) {
            this.currencyChestChain = currencyChestChain;
    }

    @Override
    public void moneyWithDrawn(AmountWithdrawn amountWithdrawn) {
            if (amountWithdrawn.getAmount() >=200 || amountWithdrawn.getAmount() < 500){
                System.out.println("Amount withdrawn 200");
            }
            currencyChestChain.moneyWithDrawn(amountWithdrawn);
    }
}
