public class Main {
    public static void main(String[] args){
        SingleProduct mouse = new SingleProduct("Fantech Mouse", "Fantech Cruiser WG11 Mouse", 1800.0);
        SingleProduct laptop = new SingleProduct("Sosta laptop", "laptop er descriptionnn", 8000.0);
        SingleProduct keyboard = new SingleProduct("second hand keyboard", "2ta key missing", 350.0);
        
        BundleProduct techBundle = new BundleProduct("Cheap Tech bundle", 150.0);
        techBundle.addProduct(laptop);
        techBundle.addProduct(keyboard);

        BundleProduct deskBundle = new BundleProduct("Best Desk Bundle with Fantech Gaming Mouse", 400.0);
        deskBundle.addProduct(techBundle);
        deskBundle.addProduct(mouse);

        deskBundle.getDescription();
        System.out.println(deskBundle.getPrice());
    }

}
