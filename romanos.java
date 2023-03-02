public class romanos {
    public static void main(String[] args) {
        String romano = "MCMIV";
        System.out.println(sumador(romano));
    }

    public static int sumador(String input) {
        String[] cadena = input.split("");
        int largo = cadena.length;
        int suma = 0;
        for (int i = 0; i < largo; i++) {
            if (i + 1 < largo) {
                if (conversor(cadena[i]) > conversor(cadena[i + 1])) {
                    suma += conversor(cadena[i]);
                } else {
                    suma -= conversor(cadena[i]);
                }
            } else {
                suma += conversor(cadena[i]);
            }
        }
            return suma;
    }
    public static int conversor(String letra){
        int[] decimal = {1,5,10,50,100,500,1000};
        String[] romano = {"I","V","X","L","C","D","M"};
        for (int i = 0; i < romano.length; i++) {
            if (letra.equalsIgnoreCase(romano[i])){
                return decimal[i];
            }

        }
        return 0;
    }
}
