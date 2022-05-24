public class Bubble_Sort {
public void sort(Integer [] bubbleArray) {
    boolean isItSorted;
    for(Integer i = 0; i < bubbleArray.length; i++ ) {
        isItSorted = true;
        for(Integer j = 1; j < bubbleArray.length -  i; j++)
            if( bubbleArray[j] < bubbleArray[j -1 ]) {
                swap(bubbleArray, j, j-1);
                isItSorted = false;
            }
        if(isItSorted)
            return;
    }
}

private void swap( Integer[] bubbleArray, Integer index1, Integer index2) {
    Integer tempArray = bubbleArray[index1];
    bubbleArray[index1] = bubbleArray[index2];
    bubbleArray[index2] = tempArray;
}
}
