public class Counting_Sort {
    void countingSort(Character charArray[]) {
        Integer n = charArray.length;
        Character outputOfCharArray[] = new Character[n];


        Integer countArray[] = new Integer[256];
        for(Integer i = 0; i< 256; i++)
            countArray[i] = 0;

        for(Integer i = 0; i < n; ++i)
            ++countArray[charArray[i]];

        for(Integer i = 1; i<= 255; ++i)
            countArray[i] += countArray[i -1 ];

        for(Integer i = n -1; i >= 0; i--) {
            outputOfCharArray[countArray[charArray[i]] -1 ] = charArray[i];
            --countArray[charArray[i]];
        }

        for(Integer i = 0; i < n; ++i)
            charArray[i] = outputOfCharArray[i];
    }
}
