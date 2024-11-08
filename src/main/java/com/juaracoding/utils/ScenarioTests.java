package com.juaracoding.utils;

public enum ScenarioTests {
    //T1 - T1000
    //Login feature
    T1("Valid Login"),
    T2("Login with <Invalid Case>"),
    //Cart Feature
    T3("Add product to cart");


    private String scenarioTestName;

    ScenarioTests(String value) {
        scenarioTestName = value;
    }

    public String getScenarioTestName() {
        return scenarioTestName;
    }
}