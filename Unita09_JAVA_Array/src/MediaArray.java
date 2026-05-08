public class MediaArray {
    public static double media(int[] v) {
        if (v.length == 0) return 0.0;
        long somma = 0;
        for (int x : v) somma += x;
        return (double) somma / v.length;
    }

    public static void main(String[] args) {
        int[] voti = {28, 30, 24, 27, 30, 26};
        System.out.println("Media: " + media(voti));
    }
}
