package homework.resource;

import homework.TotalCost;

public class Withdraw {
    private int withdraw;

    public Withdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public synchronized void applyOperation(TotalCost totalCost) {
        totalCost.setTotalCost(totalCost.getTotalCost() - withdraw);
    }
}
