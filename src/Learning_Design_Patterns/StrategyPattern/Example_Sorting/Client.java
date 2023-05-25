package Learning_Design_Patterns.StrategyPattern.Example_Sorting;

public class Client {
    public static void main(String[] args) {
        int arr[] = {5, 4, 5, 2, 66, 7, 9,90 ,100, 1,2,4,490 ,100,144};

        Sorter sorter = new Sorter();

        sorter.setSortingStrategy(new BubbleSort());
        sorter.sort(arr);

        sorter.setSortingStrategy(new SelectionSort());
        sorter.sort(arr);


    }
}
