package in.stevemann.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {30,21,-14,6,9,55,3, -10};

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++){
            int newElement = array[firstUnsortedIndex];

            int i;
            for(i = firstUnsortedIndex; i>0 && array[i-1] > newElement; i--){
                array[i] = array[i-1];
            }

            array[i] = newElement;
        }

        for(int i: array){
            System.out.println(i);
        }
    }

    private static void swap(int[] array, int index1, int index2){
        int temp;

        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
