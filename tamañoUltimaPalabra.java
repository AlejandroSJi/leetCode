public class tamañoUltimaPalabra {
    static public int lengthOfLastWord(String s) {

        String[] temp = s.split(" ");
        if (temp.length==0)
            return 0;
        return temp[temp.length-1].length();

    }

    public static void main(String[] args) {
        String s = " ";
        System.out.println(lengthOfLastWord(s));
    }
}
