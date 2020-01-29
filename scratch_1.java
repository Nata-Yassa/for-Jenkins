class Scratch {
    public static void main(String[] args) {
        int [] numbers = {987654, 23454, 66778, 345, 7865};
        int [] digits = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            digits[i] = numberOfDigits(numbers[i]);
            System.out.println(i + " " + numbers[i] + " " + digits[i]);
        }
        int min = 0 ;
        for (int i = 1; i < digits.length; i++) {
            if (digits[min] < digits[i]) {
                min = min;
            }else {
                min = i;
            }

        }
        System.out.println(min);

        int max = digits[0];
        for (int i = 1; i < digits.length; i++) {
            if (max > digits[i]){
                max = max;
            }else {
                max = digits[i];
            }

        }
        System.out.println(max);


    }
    public static int numberOfDigits(int num) {
        int c = (num == 0) ? 1 : 0;
        while (num != 0) {
            c++;
            num /= 10;
        }
        return c;
    }





}