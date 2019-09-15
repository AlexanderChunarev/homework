package homework.process;

import homework.TotalCost;
import homework.resource.Multiply;
import homework.resource.Withdraw;

public class ThirdProcess extends Thread {
    private final TotalCost totalCost;
    private Multiply multiplyResource;
    private Withdraw withdrawResource;

    public ThirdProcess(TotalCost cost, int mulCoefficient, int withdrawPoints) {
        this.totalCost = cost;
        multiplyResource = new Multiply(mulCoefficient);
        withdrawResource = new Withdraw(withdrawPoints);
    }

    @Override
    public void run() {
        synchronized (this) {
            withdrawResource.applyOperation(totalCost);
            multiplyResource.applyOperation(totalCost);
        }
    }
}
