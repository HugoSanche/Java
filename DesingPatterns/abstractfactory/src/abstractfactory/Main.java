package abstractfactory;

public class Main {
    public static void main(String[] args) {
        AbstractProduct productA = AbstractProductFactory.getProduct(new ConcreteProductAFactory());
        AbstractProduct productB = AbstractProductFactory.getProduct(new ConcreteProductBFactory());
        System.out.println("Method for product A Config {}"+ productA.commonMethod());
        System.out.println("Method for product B Config {}"+ productB.commonMethod());


//        AbstractProduct productA = AbstractProductFactory.getProductById("productA");
//        AbstractProduct productB = AbstractProductFactory.getProductById("productB");
//        System.out.println("Method for product A Config {} "+ productA.commonMethod());
//        System.out.println("Method for product B Config {} "+productB.commonMethod());


    }
}