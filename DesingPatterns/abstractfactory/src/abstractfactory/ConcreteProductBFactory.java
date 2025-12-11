package abstractfactory;

//Concrete Factory for Laptop
public class ConcreteProductBFactory implements AbstractFactory {

    @Override
    public AbstractProduct createAbstractProduct() {
        return new ProductB();
    }
}