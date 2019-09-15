package homework.process;

import homework.TotalCost;
import homework.resource.*;

public class FirstProcess extends Thread {
    private final TotalCost totalCost;
    private Add addResource;
    private Multiply multiplyResource;
    private Withdraw withdrawResource;

    public FirstProcess(TotalCost cost, int additionalPoints, int mulCoefficient, int withdrawPoints) {
        this.totalCost = cost;
        addResource = new Add(additionalPoints);
        multiplyResource = new Multiply(mulCoefficient);
        withdrawResource = new Withdraw(withdrawPoints);
    }

    @Override
    public void run() {
        synchronized (this) {
            addResource.applyOperation(totalCost);
            withdrawResource.applyOperation(totalCost);
            multiplyResource.applyOperation(totalCost);
        }
    }
}
