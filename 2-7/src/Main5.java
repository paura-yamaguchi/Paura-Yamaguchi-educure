public class Main5 {
     public static void main(String[] args) {
        
        // 商品の値段
        int notebook = 280 * 3;
        int pencil =120 * 5;
        int eraser =100 * 2;

        // 小計
        int subtotal = notebook + pencil + eraser;

        // 消費税
        int tax = (int)(subtotal * 0.1);

        // 合計金額
        int total = subtotal + tax;

        // 支払額
        int  payment = 2000;

        // おつり
        int change =payment - total;

        // 表示
        System.out.println("小計:" + subtotal + "円");
        System.out.println("消費税:" + tax + "円");
        System.out.println("合計金額:" + total + "円");
        System.out.println("おつり:" + change + "円");

    }
    
}
