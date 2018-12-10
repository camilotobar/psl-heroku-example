package com.example.psl.hello.world;

public class HelloWorldDTO{

    private String greeting;
    private Long id;
    private double trm;

    public HelloWorldDTO(String greeting, Long id, double trm) {
        this.greeting = greeting;
        this.id = id;
        this.trm = trm;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getTrm() {
        return trm;
    }

    public void setTrm(double trm) {
        this.trm = trm;
    }

}
