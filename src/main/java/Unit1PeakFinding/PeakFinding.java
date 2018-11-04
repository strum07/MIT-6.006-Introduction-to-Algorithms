package Unit1PeakFinding;

public class PeakFinding {

    public static void main(String[] args) {
        int sampleArray[] = {1, 3, 20, 4, 1, 0};

        System.out.println(findPeakLinearArrayBruteForce(sampleArray));

    }

    public static int findPeakLinearArrayBruteForce(int[] arr) {
        int arrayLength = arr.length;

        if(arrayLength < 1){
            return -1;
        }

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
