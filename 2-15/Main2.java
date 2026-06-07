public class Main2 {
    public static void main(String[] args) {
        // 売上データ（仮の数値）
        int[] sales = {1000, 2000, 1500, 1800, 2200};
        
        // 売上合計を格納する変数
        int totalSales = 0;

        for (int i = 0; i < sales.length; i++) {
            totalSales += sales[i];

        //合計金額を表示
        System.out.println("売上合計: " + totalSales +"円");   

        }
        
    }
}
