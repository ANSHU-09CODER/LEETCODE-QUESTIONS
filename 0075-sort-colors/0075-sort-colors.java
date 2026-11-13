class Solution {
    public void sortColors(int[] arr) {
        int noz = 0, noo = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) noz++;
            else if (arr[i] == 1) noo++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < noz) arr[i] = 0;
            else if (i < noz + noo) arr[i] = 1;
            else arr[i] = 2;
        }
    }
}