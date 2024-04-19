package iteratoranditerable;

import java.util.Iterator;
import java.util.List;

public class ProductIterator implements Iterator<Product> {
    private List<Product> products;
    private int cursor;
    private int size;

    public ProductIterator(List<Product> products) {
        this.products = products;
        cursor = 0;
        size = products.size();
    }

    @Override
    public boolean hasNext() {
        return cursor != size;
    }

    @Override
    public Product next() {
        int current = cursor;
        cursor = current + 1;

        return products.get(current);
    }
}
