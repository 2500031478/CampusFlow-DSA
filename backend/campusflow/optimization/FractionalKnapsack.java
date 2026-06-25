package backend.campusflow.optimization;

import java.util.Arrays;

public class FractionalKnapsack {

    static class Item {
        int weight, value;

        Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }

    public double getMaxValue(Item[] items, int capacity) {

        Arrays.sort(items,
                (a, b) -> Double.compare(
                        (double) b.value / b.weight,
                        (double) a.value / a.weight));

        double totalValue = 0;

        for (Item item : items) {

            if (capacity >= item.weight) {

                capacity -= item.weight;
                totalValue += item.value;

            } else {

                totalValue += ((double) item.value / item.weight) * capacity;
                break;
            }
        }

        return totalValue;
    }
}