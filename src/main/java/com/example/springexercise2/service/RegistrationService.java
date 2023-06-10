package com.example.springexercise2.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegistrationService {

    private final String minimumAge;
    private final boolean newsletterSubscription;
    private final List<String> countryList;

    public RegistrationService(@Value("${strings.minimumAge}") String minimumAge,
                               @Value("${strings.newsletterSubscription}") boolean newsletterSubscription,
                               @Value("#{${strings.countryList}}") List<String> countryList) {
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
