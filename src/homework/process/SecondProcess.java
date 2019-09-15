package homework.process;

import homework.TotalCost;
import homework.resource.Add;
import homework.resource.Multiply;

public class SecondProcess extends Thread {
    private final TotalCost totalCost;
    private Add addResource;
    private Multiply multiplyResource;


    public SecondProcess(TotalCost cost, int additionalPoints, int mulCoefficient) {
        this.totalCost = cost;
        addResource = new Add(additionalPoints);
        multiplyResource = new Multiply(mulCoefficient);
    }

    @Override
    public void run() {
        synchronized (this) {
            addResource.applyOperation(totalCost);
            multiplyResource.applyOperation(totalCost);
        }
    }
}
