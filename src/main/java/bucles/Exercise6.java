package bucles;

public class Exercise6 {
    public static void main(String[] args) {
        int i = 320;
        do{
            if (i % 20 == 0){
                System.out.println(i);
            }
            i--;
        } while (i >= 160);
    }
}
