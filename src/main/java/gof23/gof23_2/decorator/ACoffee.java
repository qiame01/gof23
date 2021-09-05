package gof23.gof23_2.decorator;

import java.math.BigDecimal;

public class ACoffee extends Coffee {

    public ACoffee() {
        setDes("单品咖啡ACoffee");
        setPrice(new BigDecimal(5.0));
    }
}
