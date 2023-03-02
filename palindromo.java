
public class palindromo {
    public static void main(String[] args) {
        int x=101;
        boolean esPalindromo = esCapicua(x);
        System.out.println(esPalindromo);
    }
    public static boolean esCapicua(int x){
        String numero = String.valueOf(x);
        String[] rayos = numero.split("");
        for (int i = 0; i < rayos.length; i++) {
            if (!rayos[i].equals(rayos[rayos.length - i - 1])){
                return false;
            }
        }
        return true;
    }
}
