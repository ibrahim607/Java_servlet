package org.example.products;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private final List<Product> products = new ArrayList<>();
    private int counter = 1;

    public List<Product> getAllProducts(){
        return products;
    }

    public Product getById(int id) {
        return products.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }

    public void add(Product newProduct) {
        Product product = new Product(counter++ , newProduct.getName() , newProduct.getPrice() , newProduct.getQuantity());
        products.add(product);
    }

    public boolean update(int id , Product newProduct){
        Product product = getById(id);

        if (product!=null){
            product.setPrice(newProduct.getPrice());
            product.setName(newProduct.getName());
            product.setQuantity(newProduct.getQuantity());
            return true;
        }
        return false;
    }

    public boolean deleteById(int id){
        return products.removeIf(p -> p.getId() == id);
    }

}
