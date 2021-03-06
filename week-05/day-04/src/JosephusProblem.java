public class JosephusProblem {

    public static void main(String[] args) {
        System.out.println(josephus(1));
        System.out.println(josephus(2));
        System.out.println(josephus(3));
        System.out.println(josephus(7));
        System.out.println(josephus(12));

        System.out.println(josephus(41));

    }

    private static int josephus(int numberOfPeople) {
        String binaryNumber = Integer.toBinaryString(numberOfPeople);
        int twoToThisPower = binaryNumber.length() - 1;

        return (numberOfPeople - (int) (Math.pow(2, twoToThisPower))) * 2 + 1;
    }
}
