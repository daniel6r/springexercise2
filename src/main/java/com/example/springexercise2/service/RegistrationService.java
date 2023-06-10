package com.example.springexercise2.service;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegistrationService {

    private final String minimumAge;
    private final boolean newsletterSubscription;
    private final List<String> countryList;

    public RegistrationService(String minimumAge, boolean newsletterSubscription, List<String> countryList) {
        this.minimumAge = minimumAge;
        this.newsletterSubscription = newsletterSubscription;
        this.countryList = countryList;
    }

    public String getMinimumAge() {
        return minimumAge;
    }

    public boolean isNewsletterSubscription() {
        return newsletterSubscription;
    }

    public List<String> getCountryList() {
        return countryList;
    }
}
