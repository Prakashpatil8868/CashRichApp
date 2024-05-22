package com.example.cashrichapp.controller;

import com.example.cashrichapp.service.CryptoServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/crypto")
public class CryptoAppController {
        @Autowired
        private CryptoServiceAPI cryptoServiceAPI;

        @GetMapping("/quotes")
        public String getCryptoQuotes(@RequestParam String symbols) {
            return cryptoServiceAPI.getCryptoData(symbols);
        }
    }

