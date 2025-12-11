package consumer.specific;

import dev.lpa.generics.BaseClass;

public class ChildClass extends BaseClass {

    @Override
    protected void optionalMethod() {
        System.out.println("[Child:optionalMethod] extra Stuff Here");
        super.optionalMethod();
    }


}
