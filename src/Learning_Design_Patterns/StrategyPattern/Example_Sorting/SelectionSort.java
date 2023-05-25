package Learning_Design_Patterns.StrategyPattern.Example_Sorting;

public class SelectionSort implements SortingStrategy{
    @Override
    public void sort(int[] arr) {

        int step = 1 ;
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index

                    System.out.println(step + "Selection");
                    step++;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}