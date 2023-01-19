package designpattern.chain_design_patter.atm_machine;

public class Test {
    public static void main(String[] args) {
        CurrencyChestChain RS500 = new Rs500Chest();
        CurrencyChestChain Rs200 = new RS200Chest();
        CurrencyChestChain Rs100 = new RS100Chest();

        RS500.setNextCUrrencyChain(Rs200);
        Rs200.setNextCUrrencyChain(Rs100);

        AmountWithdrawn amountWithdrawn = new AmountWithdrawn(250);
        RS500.moneyWithDrawn(amountWithdrawn);
    }
}
