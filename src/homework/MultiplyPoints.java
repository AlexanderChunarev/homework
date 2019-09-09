package homework;

class MultiplyPoints extends Resource {
    private int points;

    MultiplyPoints(int points) {
        this.points = points;
    }

    @Override
    void applyOperation(TotalCost cost) {
        synchronized (this) {
            cost.setTotalCost(cost.getTotalCost() * points);
        }
    }
}
