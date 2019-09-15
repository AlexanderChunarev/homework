package homework;

import homework.process.FirstProcess;
import homework.process.SecondProcess;
import homework.process.ThirdProcess;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        TotalCost cost = new TotalCost();
        cost.setTotalCost(200);

        FirstProcess firstProcess = new FirstProcess(cost, 20, 2, 50);
        SecondProcess secondProcess = new SecondProcess(cost, 20, 2);
        ThirdProcess thirdProcess = new ThirdProcess(cost, 2, 50);

        firstProcess.start();
        secondProcess.start();
        thirdProcess.start();

        firstProcess.join();
        secondProcess.join();
        thirdProcess.join();

        System.out.println("Total cost is: " + cost.getTotalCost());
    }
}
