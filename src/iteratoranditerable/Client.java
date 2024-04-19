package iteratoranditerable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        // syntactic sugar for above
//        for(Integer i: list) {
//            System.out.println(i);
//        }


        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(new Product("iPhone"));
        shoppingCart.addProduct(new Product("PS5"));
        shoppingCart.addProduct(new Product("iPhone 15"));
        shoppingCart.addProduct(new Product("abc"));

       Iterator<Product> iterator = shoppingCart.iterator();
       while(iterator.hasNext()) {
           System.out.println(iterator.next());
       }

       Iterator<Product> iterator1 = shoppingCart.iterator();
       while(iterator1.hasNext()) {
            System.out.println(iterator1.next());
       }

       for (Product product : shoppingCart) {
           System.out.println(product);
       }


    }
}
