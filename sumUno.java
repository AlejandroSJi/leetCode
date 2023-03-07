public class sumUno {
    public static int[] plusOne(int[] digits) {
        String num = "";
        for (int n:digits) {
            num = num +  String.valueOf(n);
        }
        int sumando = Integer.parseInt(num) + 1 ;
        num = String.valueOf(sumando);
        String[] temp =  num.split("");
        int arr[] = new int[temp.length];

        for (int i = 0; i< temp.length; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] digits = {9,9,9};
        for (int n:plusOne(digits)) {
            System.out.print(n + " ");
        }
    }
}
