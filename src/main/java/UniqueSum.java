public class UniqueSum {


    public static int uniqueSumMethod(int num1, int num2, int num3){
        int total = 0;

        if(num1 != num2 && num1 != num3 && num2 != num3){
            total += num1 + num2 + num3;
        }
        else if(num1 == num2 && num2 != num3 ){
            total += num3;
        } else if (num1 != num2 && num1 == num3){
            total += num2;
        } else if (num1 != num2 && num1 != num3){
            total += num1;
        }

        return total;
    }
}
