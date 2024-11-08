package com.juaracoding;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@CucumberOptions( features = {"/Users/macosx/Documents/jc-saucedemoselenium/src/main/resources/features/01-login.feature",
"/Users/macosx/Documents/jc-saucedemoselenium/src/main/resources/features/02-cart.feature",
        "/Users/macosx/Documents/jc-saucedemoselenium/src/main/resources/features/03-checkout.feature"},
        glue = "com.juaracoding",
        plugin = {
                "pretty", // Menampilkan hasil eksekusi di konsol
                "html:target/cucumber-reports.html", // Menghasilkan laporan HTML
                "json:target/cucumber-reports.json" // Menghasilkan laporan JSON
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
