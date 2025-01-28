public class SumOfEven {
    public static void main(String[] args) {
        int sum = 0;  // Variable to store the sum
        int i = 1;  
        while (i <= 100) {  // Loop through numbers from 1 to 100
            if (i % 2 == 0) {  // Check if the number is even
                sum = sum + i;  // Add even number to sum
            }
            i++; 
        }
        System.out.println(sum);  
    }
}
