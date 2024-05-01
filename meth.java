public class meth {

    public static int sumOfTwoNumbers(int agdum, int bagdum) {
        int ans = agdum + bagdum;
        return ans;
    }

    public static void printans(int pri) {//void means return
        System.out.println(pri);
    }

    public static void main(String[] args) {
        printans(sumOfTwoNumbers(2, 3));
        printans(sumOfTwoNumbers(3, 4));
        printans(sumOfTwoNumbers(4, 5));
        printans(sumOfTwoNumbers(5, 6));
    }
}
