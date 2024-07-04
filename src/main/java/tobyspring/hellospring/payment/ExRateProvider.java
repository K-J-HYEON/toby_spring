package tobyspring.hellospring.payment;

import java.io.IOException;
import java.math.BigDecimal;

public interface ExRateProvider {
    BigDecimal getExRate(BigDecimal currency) throws IOException;
}
