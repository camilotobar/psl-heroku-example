package com.example.psl.hello.world;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuoteDTO {

    @JsonProperty("USD_COP")
    private double USD_COP;

    public QuoteDTO() {
        super();
    }

    public double getUSD_COP() {
        return USD_COP;
    }

    public void setUSD_COP(double USD_COP) {
        this.USD_COP = USD_COP;
    }
}
