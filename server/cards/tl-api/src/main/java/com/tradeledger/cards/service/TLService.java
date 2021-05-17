package com.tradeledger.cards.service;
import org.springframework.beans.factory.annotation.Value;
import com.tradeledger.cards.common.Applicant;

import java.net.URI;

import org.springframework.web.client.*;
import org.springframework.http.*;

import org.springframework.stereotype.Service;

@Service
public class TLService {

    public ResponseEntity<String> checkEligibility(Applicant applicant) throws Exception
    {
        String url = "http://localhost:3317/eligibility/check";

       RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(url);
        ResponseEntity<String> result = restTemplate.postForEntity(uri, applicant,String.class);
        return result;
    }

}
