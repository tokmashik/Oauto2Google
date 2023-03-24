package com.example.Oauto2Google;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/")
public class SampleController {
    @GetMapping
    public Map<String, Object> cerrentUser(OAuth2AuthenticationToken OAuth2AuthenticationToken){
        return OAuth2AuthenticationToken.getPrincipal().getAttributes();
    }
}
