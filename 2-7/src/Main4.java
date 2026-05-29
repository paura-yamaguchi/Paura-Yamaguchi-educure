public class Main4 {
    public static void main(String[] args) {
        
        //　100g当たりの値段
        int pricePer100g = 138;

        // 購入量(g)
        double weight =315.8;

        // 合計金額を計算
        double total = pricePer100g * weight / 100;

        //小数点以下切り捨て
        int result = (int) total;

        //表示
        System.out.println("合計金額:" + result + "円です");

    }
}

