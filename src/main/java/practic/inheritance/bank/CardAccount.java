package practic.inheritance.bank;

public class CardAccount extends BankAccount {

    @Override
    public void take(double amountToTake) {
        double amountStart = super.getAmount();
        super.take(amountToTake);
        double amountEnd = getAmount();

        if(amountStart > amountEnd) { //если списание произошло
            amount = amount - amountToTake * 0.01;// комиссия 1%
        }

    }
}
