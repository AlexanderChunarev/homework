package homework;

class WithdrawPoints extends Resource {
    private int points;

    WithdrawPoints(int points) {
        this.points = points;
    }

    @Override
    void applyOperation(TotalCost cost) {
        synchronized (this) {
            cost.setTotalCost(cost.getTotalCost() - points);
        }
    }
}
