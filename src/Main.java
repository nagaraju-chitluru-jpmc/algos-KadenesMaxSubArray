public class Main {
    public static void main(String[] args) {
        int[] inputData = new int[] {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println("Max sub-array sum is " + maxSubArraySum(inputData));
    }

    static int maxSubArraySum(int[] inputData) {
        if(inputData.length == 0)
            throw new ArrayIndexOutOfBoundsException("input data should contain at least one element ");

        if(inputData.length == 1)
            return inputData[0];

        int previousSum = inputData[0];
        int globalSum = previousSum;

        for(int i = 1; i < inputData.length; ++i) {
            previousSum = Math.max(inputData[i], previousSum + inputData[i]);
            globalSum = Math.max(globalSum, previousSum);
        }

        return globalSum;
    }
}