package com.example.cashrichapp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class CryptoServiceAPI {
    @Value("${coinmarketcap.api.url}")
    private String apiUrl;

    @Value("${coinmarketcap.api.key}")
    private String apiKey;

    public String getCryptoData(String symbols) {
        RestTemplate restTemplate = new RestTemplate();
        String url = apiUrl + "?symbol=" + symbols + "&CMC_PRO_API_KEY=" + apiKey;
        return restTemplate.getForObject(url, String.class);
    }
}