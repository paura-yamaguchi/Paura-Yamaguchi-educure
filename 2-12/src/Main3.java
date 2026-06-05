public class Main3 {
    public static void main(String[] args) {
        int height = 5;

        for (int i = 1; i <= height; i++) {

            for (int j = 1; j <=height - i; j++) {
                System.out.println(" ");

            }

            for (int k = 1; k <= i * 2 - 1; k++){
                System.out.println("*");
            }
            System.out.println();
            
        }
    }
}

