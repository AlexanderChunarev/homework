package homework.process;

import homework.TotalCost;
import homework.resource.Add;
import homework.resource.Multiply;

public class SecondProcess implements Runnable {
    private final TotalCost totalCost;
    private Add addResource;
    private Multiply multiplyResource;
    public Thread thread;

    public SecondProcess(TotalCost totalCost, Add addResource, Multiply multiplyResource, String name) {
        this.totalCost = totalCost;
        this.addResource = addResource;
        this.multiplyResource = multiplyResource;
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        addResource.applyOperation(totalCost, Thread.currentThread().getName());
        multiplyResource.applyOperation(totalCost, Thread.currentThread().getName());
    }
}
