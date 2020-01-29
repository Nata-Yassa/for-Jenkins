class Scratch {
    public static void main(String[] args) {
        int [] a = {2778, 23, 1, 89765, 678, 9876};
        for (int i = 0; i < a.length ; i++) {
           int min = a[i];
           int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min){
                    min =a [j];
                    minIndex = j;
                }
            }
            if (i != minIndex){
                int z = a[i];
                a[i] = a[minIndex];
                a[minIndex] = z;
            }
            System.out.println(a[i] + "  ");
        }
    }
}