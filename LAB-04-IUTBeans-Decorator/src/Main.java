public class Main {
    public static void main(String[] args) {
    
    var Coffee = new Milk(new Milk(new WhiteSugar(new Cappuccino())));
    
    System.out.println(Coffee.getDescription());
    }
}
