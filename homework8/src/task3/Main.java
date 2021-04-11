package task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Price [] items = new Price [2];

        Price it1 = new Price();
        Price it2 = new Price();

        System.out.println("Enter name of the first item");
        it1.setName(in.nextLine());
        System.out.println("Enter name of the shop");
        it1.setShopName();
        System.out.println("Enter price in grn");
        it1.setPrice();

        System.out.println("================");

        System.out.println("Enter name of the second item");
        it2.setName(in.nextLine());
        System.out.println("Enter name of the shop");
        it2.setShopName();
        System.out.println("Enter price in grn");
        it2.setPrice();

        String [] shopNames = {it1.shop, it2.shop};
        Arrays.sort(shopNames);
        System.out.println(Arrays.toString(shopNames));

        if (shopNames[0] == it1.getShop()){
            items[0] = it1;
            items[1] = it2;
        }
        else{
            items[0] = it2;
            items[1] = it1;
        }

        System.out.println(Arrays.toString(items));
    }
}
