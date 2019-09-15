package homework.resource;

import homework.TotalCost;

public class Multiply {
    private int mulCoefficient;
    public Multiply(int mulCoefficient) {
        this.mulCoefficient = mulCoefficient;
    }

    public synchronized void applyOperation(TotalCost totalCost) {
        totalCost.setTotalCost(totalCost.getTotalCost() * mulCoefficient);
    }
}
