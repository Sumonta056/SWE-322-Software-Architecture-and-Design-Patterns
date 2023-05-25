package Learning_Design_Patterns.StrategyPattern.Example_Sorting;

public class Sorter {
    private SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    public void sort(int arr[]){
        sortingStrategy.sort(arr);
    }
}