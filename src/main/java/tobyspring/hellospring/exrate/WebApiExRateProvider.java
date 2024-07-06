package tobyspring.hellospring.exrate;

import tobyspring.hellospring.api.ApiTemplate;
import tobyspring.hellospring.payment.ExRateProvider;
import java.math.BigDecimal;

public class WebApiExRateProvider implements ExRateProvider {
    private ApiTemplate apiTemplate;

    public WebApiExRateProvider(ApiTemplate apiTemplate) {
        this.apiTemplate = apiTemplate;
    }

    @Override
    public BigDecimal getExRate(BigDecimal currency) {
        return null;
    }

    @Override
    public BigDecimal getExRate(String currency) {
        String url = "https://open.er-api.com/v6/latest/" + currency;

        return apiTemplate.getForExRate(url);
    }
}