public class ConnorBlackJack {
    public static int blackJack(int num1 , int num2){
        if (num1 > 21 && num2 > 21){
            return 0;
        } else if (num1 <=21 && num1 > num2 || num2 >= 22) {
            return num1;
        } else if (num2 <=21 && num2 > num1 || num1 > 21) {
            return num2;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(blackJack(22,21));
    }
}

