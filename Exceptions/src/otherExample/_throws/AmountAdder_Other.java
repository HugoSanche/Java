package otherExample._throws;

public class AmountAdder_Other {
    public static Amount adderAmount(Amount amount1, Amount amount2)throws Exception{
        System.out.println(amount1.getCurrency());
        System.out.println(amount2.getCurrency());

        if (!amount1.getCurrency().equals(amount2.getCurrency())){
            throw new ExceptionEqualsAmount();
        }
        return new Amount(amount1.getCurrency(), amount1.getAmount()+amount2.getAmount());
    }
}
