package BitManipulation;

public class onesAndTwosComplement {

    //space and time complexity are O(log n)
    public static String decimalToBinary(int num){
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while(num > 0){
            sb.append(num % 2 == 1 ? "1" : "0");
            num /= 2;
        }
        sb.reverse();
        return sb.toString();
    }

    public static int binaryToDecimal(String s){
        int num = 0, inc = 1;
//        for(int i = s.length() - 1; i >= 0; i--){
//            if(s.charAt(i) == '1') num += (int)Math.pow(2,s.length() - i - 1);
//        }
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == '1') num += inc;
            inc *= 2;
        }
        return num;
    }

    //ones complement - flip the digits of the binary representation
    //twos complement - take ones complement and add 1 to the binary representation
    public static void main(String[] args) {
        int a = 13;
        System.out.println(decimalToBinary(a));
        System.out.println(binaryToDecimal("1101"));
    }
}
