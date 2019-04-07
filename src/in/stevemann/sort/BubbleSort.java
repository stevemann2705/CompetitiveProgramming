package in.stevemann.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {30,21,-14,6,9,55,3, -10};

        for(int i=0; i<array.length; i++){
            for (int j = 1; j < array.length - i; j++) {
                if(array[j-1] > array[j]){
                    swap(array, j-1, j);
                }
            }
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
