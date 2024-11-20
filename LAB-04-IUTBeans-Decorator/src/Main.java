public class Main {
    public static void main(String[] args) {
    
    Beverage Coffee = new Milk(new Milk(new WhiteSugar(new Expresso())));
    
    

    System.out.println(Coffee.getDescription());
    }
}
