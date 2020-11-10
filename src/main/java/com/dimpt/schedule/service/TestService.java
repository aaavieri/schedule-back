package com.dimpt.schedule.service;

import javax.enterprise.context.Dependent;

@Dependent
public class TestService implements TestIf {
    public String getTest() {
        return "123";
    }
}
