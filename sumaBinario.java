public class sumaBinario {
    public static int convertirDecimal(String binario) {
        String [] dividir = binario.split("");
        int tamaño=dividir.length;
        int suma=0;
        for (int i = 0; i < tamaño; i++) {
            suma += Integer.valueOf(dividir[i])*(Math.pow(2,tamaño-1-i));
        }
        return suma;
    }

    public static String sumaBinario(int a){
        if ((a/2)==0)
            return String.valueOf(a%2);
        else{
            return sumaBinario(a/2)+String.valueOf(a%2);
        }
    }

    public static void main(String[] args) {
        String a = "1010", b = "1011";
        int num1 = convertirDecimal(a);
        int num2 = convertirDecimal(b);
        System.out.println(sumaBinario(num1+num2));
    }
}
