public class clearBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int negation = ~(bitMask);
        int newNumber = negation & n;
        System.out.println(newNumber);
    }
}
