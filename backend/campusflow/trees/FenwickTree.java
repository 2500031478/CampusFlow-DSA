package backend.campusflow.trees;
public class FenwickTree {

    private int[] BIT;
    private int size;

    public FenwickTree(int size) {
        this.size = size;
        this.BIT = new int[size + 1];
    }

    public void update(int index, int value) {

        while (index <= size) {
            BIT[index] += value;
            index += index & (-index);
        }
    }

    public int query(int index) {

        int sum = 0;

        while (index > 0) {
            sum += BIT[index];
            index -= index & (-index);
        }

        return sum;
    }

    public int rangeQuery(int left, int right) {

        return query(right) - query(left - 1);
    }

    public static void main(String[] args) {

        FenwickTree tree = new FenwickTree(10);

        tree.update(1, 5);
        tree.update(2, 3);
        tree.update(5, 10);

        System.out.println(
                "Prefix Sum till 5 = "
                        + tree.query(5)
        );

        System.out.println(
                "Range Sum (2,5) = "
                        + tree.rangeQuery(2, 5)
        );
    }
}