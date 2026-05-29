public class Main2 {
  public static void main(String[] args) {
        
        int price = 2500;  
        int discountRate = 20;
        
        int discount = price * discountRate / 100;
        int salePrice = price - discount;

        System.out.println("割引額:" + discount + "円");
        System.out.println("販売価格:" + salePrice + "円");

    }  
}