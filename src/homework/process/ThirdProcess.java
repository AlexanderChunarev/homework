package homework.process;

import homework.TotalCost;
import homework.resource.Multiply;
import homework.resource.Withdraw;

public class ThirdProcess implements Runnable {
    private final TotalCost totalCost;
    private Multiply multiplyResource;
    private Withdraw withdrawResource;
    public Thread thread;

    public ThirdProcess(TotalCost totalCost, Multiply multiplyResource, Withdraw withdrawResource, String name) {
        this.totalCost = totalCost;
        this.multiplyResource = multiplyResource;
        this.withdrawResource = withdrawResource;
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        withdrawResource.applyOperation(totalCost, Thread.currentThread().getName());
        multiplyResource.applyOperation(totalCost, Thread.currentThread().getName());
    }
}
