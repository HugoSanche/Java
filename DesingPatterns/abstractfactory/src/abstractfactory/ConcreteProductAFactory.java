package abstractfactory;

//Concrete Factory for Desktop
public class ConcreteProductAFactory implements AbstractFactory {


    @Override
    public AbstractProduct createAbstractProduct() {
        return new ProductA();
    }
}
