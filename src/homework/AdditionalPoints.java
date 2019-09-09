package homework;

class AdditionalPoints extends Resource {
    private int points;

    AdditionalPoints(int points) {
        this.points = points;
    }

    @Override
    void applyOperation(TotalCost cost) {
        synchronized (this) {
            cost.setTotalCost(cost.getTotalCost() + points);
        }
    }
}
