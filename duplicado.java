public class duplicado {
    private static int borrarDobles(int arrayRepetida[], int largo)
    {
        int j = 0;
        for (int i = 0; i < largo-1; i++)
            if (arrayRepetida[i] != arrayRepetida[i+1]){
                arrayRepetida[j] = arrayRepetida[i];
                j++;
            }
        arrayRepetida[j] = arrayRepetida[largo-1];
        j++;

        return j;
    }

    public static void main (String[] args)
    {
        int arrayRepetida[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int largo = arrayRepetida.length;

        largo = borrarDobles(arrayRepetida, largo);

        for (int i=0; i<largo; i++)
            System.out.print(arrayRepetida[i]+" ");
    }
}
