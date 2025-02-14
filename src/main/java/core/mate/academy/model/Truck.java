package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxWeight;

    public Truck() {
    }

    public Truck(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
