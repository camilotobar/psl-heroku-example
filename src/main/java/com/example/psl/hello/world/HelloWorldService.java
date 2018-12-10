package com.example.psl.hello.world;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class HelloWorldService {

    private final static String URL ="https://free.currencyconverterapi.com/api/v6/convert?q=USD_COP&compact=ultra";

    private RestTemplate restTemplate = new RestTemplate();

    public HelloWorldDTO getDTOWithTRM(String greeting){
        return new HelloWorldDTO(greeting, 0L, getTRM());
    }

    public double getTRM(){
        try {
            QuoteDTO trm = restTemplate.getForEntity(new URI(URL), QuoteDTO.class).getBody();
            return trm.getUSD_COP();
        }catch (Exception e){return 0.0; }
    }
}
