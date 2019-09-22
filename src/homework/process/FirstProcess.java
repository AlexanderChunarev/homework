package homework.process;

import homework.TotalCost;
import homework.resource.*;

public class FirstProcess implements Runnable {
    private final TotalCost totalCost;
    private Add addResource;
    private Multiply multiplyResource;
    private Withdraw withdrawResource;
    public Thread thread;


    public FirstProcess(TotalCost totalCost, Add addResource, Multiply multiplyResource, Withdraw withdrawResource, String name) {
        this.totalCost = totalCost;
        this.addResource = addResource;
        this.multiplyResource = multiplyResource;
        this.withdrawResource = withdrawResource;
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        addResource.applyOperation(totalCost, Thread.currentThread().getName());
        multiplyResource.applyOperation(totalCost, Thread.currentThread().getName());
        withdrawResource.applyOperation(totalCost, Thread.currentThread().getName());
    }
}
