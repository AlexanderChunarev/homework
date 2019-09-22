package homework.resource;

import homework.TotalCost;

public class Add {
    private int points;

    public Add(int points) {
        this.points = points;
    }

    public synchronized void applyOperation(TotalCost totalCost, String thread) {
        System.out.println("Ресурс Add используется процессом " + thread);
        totalCost.setTotalCost(totalCost.getTotalCost() + points);
    }
}
