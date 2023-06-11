public class Main {
    public static void main(String[] args) {
        int[] numbers = {42, 20, 1, 13};
        int temp;
        for(int i = 0; i < numbers.length -1; i++) {
            if(numbers[i] > numbers[i+1]) {
                temp = numbers[i + 1];
                numbers[i + 1] = numbers[i];
                numbers[i] = temp;
                System.out.println("Index " + i + ":" + numbers[i]);
            }
        }
        System.out.println("Index 3:" + numbers[3]);
    }
}