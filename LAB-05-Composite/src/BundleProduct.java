import java.util.ArrayList;
import java.util.List;

// Make this an Abstract class and create Bundle Classes overrding this class

public class BundleProduct implements Product {
    public List<Product> productList = new ArrayList<>();
    public String name;
    public Double discount;
    
    @Override
    public Double getPrice() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getPrice'");
        Double totalPrice = 0.0;
        for (Product product : productList) {
            totalPrice += product.getPrice();
        }
        return totalPrice - discount;
    }

    @Override
    public void getDescription() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getDescription'");
        System.out.println("Bundle: " + name);
        System.out.println("Products: ");
        for (Product product : productList) {
            product.getDescription();
        }
    }

    public BundleProduct(String name, Double discount){
        this.name = name;
        this.discount = discount;
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public void removeProduct(Product product){
        productList.remove(product);
    }
}
