package com.restcurrency.myapp.controller;

import com.restcurrency.myapp.model.Currency;
import com.restcurrency.myapp.service.RatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@RestController
@EnableScheduling
public class CurrencyController {

    @Autowired
    private final RestTemplate restTemplate;
    private final RatesService ratesService;

    public CurrencyController(RestTemplate restTemplate, RatesService ratesService) {
        this.restTemplate = new RestTemplate(
                new BufferingClientHttpRequestFactory(
                        new SimpleClientHttpRequestFactory()));
        this.ratesService = ratesService;
    }

//  @Scheduled(cron = "0 0 */3 * * *")//every 3 hour
    @Scheduled(cron = "0 */5 * * * *" )//every 10 seconds, for test
    @GetMapping("/currency")
    public Currency getCurrencies(){
        String url = "https://api.exchangeratesapi.io/latest";
        Currency currency = restTemplate.getForObject(url, Currency.class);
        currency.getRates().setDate(new Date());
        ratesService.saveRates(currency.getRates());
        return currency;
    }
}
