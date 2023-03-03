import java.util.Arrays;

public class prefijo {
    public static void main(String[] args) {
        String [] strg = {"flower","flowres","flow       tar"};
        int tamaño = prefijador(strg);
        for (int i = 0; i < tamaño; i++) {
            System.out.print(strg[0].charAt(i));
        }
     }
    public static int prefijador (String[] strg){
        Arrays.sort(strg);
        int end = strg.length-1;
        int largo = Math.max(strg[0].length(),strg[end].length());
        for (int i = 0; i < largo; i++) {
            char letraUno = strg[0].charAt(i);
            char letraDos = strg[end].charAt(i);
            if (letraUno!=letraDos){
                return i;
            }
        }
            return largo;
    }
}
