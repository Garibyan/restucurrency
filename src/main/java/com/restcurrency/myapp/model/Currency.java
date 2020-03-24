package com.restcurrency.myapp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "rates",
        "base",
        "date"
})
@Entity
@Table(name = "currency")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty("rates")
    @OneToOne
    private Rates rates;
    @JsonProperty("base")
    private String base;
    @JsonProperty("date")
    private String date;

    @JsonProperty("rates")
    public Rates getRates() {
        return rates;
    }
    @JsonProperty("rates")
    public void setRates(Rates rates) {
        this.rates = rates;
    }
    @JsonProperty("base")
    public String getBase() {
        return base;
    }
    @JsonProperty("base")
    public void setBase(String base) {
        this.base = base;
    }
    @JsonProperty("date")
    public String getDate() {
        return date;
    }
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }
}
