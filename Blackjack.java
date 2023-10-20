public class Blackjack {

    public static int playGame(int num1, int num2){
        int delta1 = 21-num1;
        int delta2 = 21-num2;

        if ((delta1 >= 0) && (delta2 >= 0)) {
            return Math.max(num1, num2);
        } else if ((delta1 < 0) && (delta2 < 0)) {
            return 0;
        } else {
            if (delta1 < 0) return num2;
            else return num1;
        }
    }

    public static void main(String[] args) {
        System.out.println(playGame(3,12));
    }
}
