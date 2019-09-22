package homework.resource;

import homework.TotalCost;

public class Withdraw {
    private int withdraw;

    public Withdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public synchronized void applyOperation(TotalCost totalCost, String thread) {
        System.out.println("Ресурс Withdraw используется процессом " + thread);
        totalCost.setTotalCost(totalCost.getTotalCost() - withdraw);
    }
}
