package task3;

import java.util.*;

public class Price {
    String name, shop;
    int price_grn;

    @Override
    public String toString() {
        return "name = '" + name + '\'' +
                ", shop = '" + shop + '\'' +
                ", price = " + price_grn + "grn";
    }

    public  void setPrice(){
        Scanner in = new Scanner(System.in);

        try{
            setPrice_grn(in.nextInt());
        } catch(Exception e){
            System.out.println("Invalid format. please retry");
            setPrice();
        }
    }

    public void setShopName(){
        Scanner in = new Scanner(System.in);

        try{
            setShop(in.nextLine());
        } catch(Exception e){
            System.out.println("Invalid format. please retry");
            setShopName();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public int getPrice_grn() {
        return price_grn;
    }

    public void setPrice_grn(int price_grn) {
        this.price_grn = price_grn;
    }
}
