public class Sqrt {

    public static int mySqrt(int x) {
        if (x<4){
            return 1;
        }

        for (int i = 1; i <= (x/2)+1; i++) {
            if ((i*i)==x){
                return i;
            }else if ((i*i)>x){
                return i-1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(3123));
        System.out.println(mySqrt(214748));
    }

}
