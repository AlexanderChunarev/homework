package homework;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        TotalCost cost = new TotalCost();
        cost.setTotalCost(200);

        MyThread firstThread = new MyThread(cost);
        MyThread secondThread = new MyThread(cost);
        MyThread thirdThread = new MyThread(cost);

        Resource additionalPoints = new AdditionalPoints(20);
        Resource multiplyPoints = new MultiplyPoints(2);
        Resource withdrawPoints = new WithdrawPoints(50);

        // 1-st step
        ArrayList<Resource> firstResources = new ArrayList<>();
        firstResources.add(additionalPoints);
        firstResources.add(withdrawPoints);
        firstResources.add(multiplyPoints);

        // 2-st step
        ArrayList<Resource> secondResources = new ArrayList<>();
        firstResources.add(additionalPoints);
        firstResources.add(multiplyPoints);

        // 3-st step
        ArrayList<Resource> thirdResources = new ArrayList<>();
        firstResources.add(withdrawPoints);
        firstResources.add(multiplyPoints);


        firstThread.setResources(firstResources);
        secondThread.setResources(secondResources);
        thirdThread.setResources(thirdResources);

        firstThread.start();
        secondThread.start();
        thirdThread.start();

        firstThread.join();
        secondThread.join();
        thirdThread.join();

        System.out.println(cost.getTotalCost());
    }
}
