package com.restcurrency.myapp.service;

import com.restcurrency.myapp.model.Rates;
import com.restcurrency.myapp.repository.RatesRepository;
import org.springframework.stereotype.Service;

@Service
public class RatesService {

    private final RatesRepository ratesRepository;

    public RatesService(RatesRepository ratesRepository) {
        this.ratesRepository = ratesRepository;
    }

    public void saveRates(Rates rates){
        ratesRepository.saveAndFlush(rates);
    }
}
