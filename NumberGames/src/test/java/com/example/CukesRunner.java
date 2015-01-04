package com.example;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(
        features={"src/test/resources"}
)
public class CukesRunner {}
