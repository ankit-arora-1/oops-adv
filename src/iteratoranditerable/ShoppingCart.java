package iteratoranditerable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart implements Iterable<Product> {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public Iterator<Product> iterator() {
        return new ProductIterator(products);
    }
}
