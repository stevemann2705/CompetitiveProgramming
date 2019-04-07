package in.stevemann.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {30,21,-14,6,9,55,3, -10};

        for (int lastunsortedindex = array.length - 1; lastunsortedindex > 0; lastunsortedindex--) {
            int largestIndex = 0;

            for (int i = 1; i <= lastunsortedindex; i++) {
                if(array[i] > array[largestIndex])
                    largestIndex = i;
            }

            swap(array, largestIndex, lastunsortedindex);
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
