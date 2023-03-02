public class sumaArray {
    public static void main(String[] args) {
        int []nums= {3,3,4,15};
        int target = 6;
        int[]posiciones = buscador(nums,target);

        System.out.print("[");
        for (int resultado:posiciones) {
            System.out.print(" " + resultado + " ");
        }
        System.out.print("]");

    }
    public static int[] buscador(int[] array, int objetivo){
        for (int i=0; i<array.length;i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == objetivo) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
