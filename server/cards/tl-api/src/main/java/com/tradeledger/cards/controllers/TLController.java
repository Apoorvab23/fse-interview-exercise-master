package com.tradeledger.cards.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import com.tradeledger.cards.common.Applicant;
import org.springframework.web.bind.annotation.RequestBody;
import com.tradeledger.cards.service.TLService;

import org.springframework.http.*;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/")
public class TLController {

    @Autowired
    TLService service;

    @PostMapping(path = "checkEligibility", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> checkEligibility(@Valid @RequestBody Applicant app) throws Exception
    {

        return service.checkEligibility(app);

    }

}
