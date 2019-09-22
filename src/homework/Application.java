package homework;

import homework.process.*;
import homework.resource.*;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        TotalCost cost = new TotalCost();
        Add add = new Add(200);
        Multiply multiply = new Multiply(2);
        Withdraw withdraw = new Withdraw(50);
        cost.setTotalCost(200);

        FirstProcess firstProcess = new FirstProcess(cost, add, multiply, withdraw, "First Process");
        SecondProcess secondProcess = new SecondProcess(cost, add, multiply, "Second Process");
        ThirdProcess thirdProcess = new ThirdProcess(cost, multiply, withdraw, "Third Process");

        firstProcess.thread.join();
        secondProcess.thread.join();
        thirdProcess.thread.join();

        System.out.println("Total cost is: " + cost.getTotalCost());
    }
}
