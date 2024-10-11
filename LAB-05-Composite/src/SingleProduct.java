public class SingleProduct implements Product {
    public String productName;
    public String description;
    public Double price;

    @Override
    public Double getPrice() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getPrice'");
        return price;
    }

    @Override
    public void getDescription() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getDescription'");
        System.out.println(description);
    }

    public SingleProduct(String name, String desc, Double _price){
        productName = name;
        description = desc;
        price = _price; 
    }
}
