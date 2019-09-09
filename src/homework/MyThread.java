package homework;

import java.util.ArrayList;

public class MyThread extends Thread {
    private ArrayList<Resource> resources;
    private TotalCost totalCost;

    MyThread(TotalCost cost) {
        this.totalCost = cost;
    }

    synchronized void setResources(ArrayList<Resource> resources) {
        this.resources = resources;
    }

    @Override
    public void run() {
        for (Resource r : resources) {
            r.applyOperation(totalCost);
        }
    }
}
