package src.main.java.Unit1PeakFinding;

public class PeakFinding {

    public static void main(String[] args) {
        int sampleArray[] = {1, 3, 20, 4, 1, 0};

        int sameElements[] = {1, 1, 1, 1, 1, 1};

        int increasingElements[] = {1, 2, 3, 4, 5, 6};

        int decreasingElements[] = {6, 5, 4, 3, 2, 1};

        int edgesMaxElements[] = {2, 1, 1, 1, 2};

        System.out.println(findPeakLinear(sampleArray));

        System.out.println(findPeakLinear(sameElements));

        System.out.println(findPeakLinear(increasingElements));

        System.out.println(findPeakLinear(decreasingElements));

        System.out.println(findPeakLinear(edgesMaxElements));
    }

    private static int findPeakLinear(int[] arr) {
        int arrayLength = arr.length;

        for(int i=0;i<arrayLength;i++) {

            if (i == 0) {
                if (arr[i] >= arr[i + 1]) {
                    return arr[i];
                }
            }

            if (i == arrayLength - 1) {
                if (arr[i] >= arr[i - 1]) {
                    return arr[i];
                }
            }

            if (arr[i] >= arr[i + 1] && arr[i] >= arr[i - 1]) {
                return arr[i];
            }
        }

        return -1;
    }


}
