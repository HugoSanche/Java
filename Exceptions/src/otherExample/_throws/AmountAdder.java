package otherExample._throws;

public class AmountAdder {
    public static Amount adderAmount(Amount amount1, Amount amount2){

        if (amount1.getCurrency().equals(amount2.getCurrency())){
            throw new RuntimeExceptionEqualsAmount();
        }
        return new Amount(amount1.getCurrency(), amount1.getAmount()+amount2.getAmount());
    }
}
