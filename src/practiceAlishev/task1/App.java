package practiceAlishev.task1;

public class App {

    public static void main(String[] args) {

        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};

        System.out.println(recursionSum(numbers, numbers.length));
//        System.out.println(recursionSum(numbers, 0));

        int num = 717771237;

        System.out.println(count7(num));
    }

    public static int count7(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 10 == 7) {
            return 1 + count7(num / 10);
        } else {
            return count7(num / 10);
        }
    }

    public static int recursionSum(int[] ints, int n) {
        if (n <= 0)
            return 0;
        return (recursionSum(ints, n - 1) + ints[n - 1]);
    }

//    public static int recursionSum(int[] ints, int n) {
//        if(n == ints.length){
//            return 0;
//        }
//        return ints[n]+recursionSum(ints, n+1);
//    }
}
