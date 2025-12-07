package practic.inheritance.bank;
import java.time.LocalDate;

public class DepositAccount extends BankAccount {

    private LocalDate lastIncome;

    @Override
    public void put(double amountToPut) {
        double amountStart = super.getAmount();
        super.put(amountToPut);
        double amountEnd = super.getAmount();
        if(amountStart < amountEnd) {// если начисление произошло
            lastIncome = LocalDate.now();
        }
    }

    @Override
    public void take(double amountToTake) {
        LocalDate newTake = LocalDate.now();
        LocalDate limitTake = lastIncome.plusMonths(1);
        if(!newTake.isBefore(limitTake)){
            super.take(amountToTake);
        }
    }
}
