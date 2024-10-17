public class DeretLooping3 {
    public static void main(String[] args) {
        int angka = 1;
        int selisih = 0;

        for(int i = 0; i < 16; i++){
            System.out.print(angka + " ");
            selisih += 2;
            angka += selisih;
        }
    }
}