import java.util.Scanner;
class FindEvenNumbers{
    public int[] findEvenNumbers(int[] numbers){
        int[] result = new int[0];
        for (int n : numbers){
            if (n % 2 == 0){
                int[] bigger = new int[result.length + 1];
                System.arraycopy(result, 0, bigger, 0, result.length);
                bigger[result.length] = n;
                result = bigger;
            }
        }
        return result;
    }

    public int[] findOddNumbers(int[] numbers){
        int[] result = new int[0];
        for (int n : numbers){
            if (n % 2 != 0){
                int[] bigger = new int[result.length + 1];
                System.arraycopy(result, 0, bigger, 0, result.length);
                bigger[result.length] = n;
                result = bigger;
            }
        }
        return result;
    }
}

public class Main{
    private static void printArray(String label, int[] arr){
        System.out.print(label);
        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int count = sc.nextInt();

        int[] numbers = new int[count];
        for (int i = 0; i < count; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        FindEvenNumbers finder = new FindEvenNumbers();
        int[] evens = finder.findEvenNumbers(numbers);
        int[] odds = finder.findOddNumbers(numbers);

        printArray("Even numbers:",evens);
        printArray("Odd numbers:",odds);

        sc.close();
    }
}