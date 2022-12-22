package com.glory.app.rest.Models;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Controller
@Service
public class Jwt {
    @Value("$ShhhhItsASecret!")
    public static final String secret = "ShhhhItsASecret!";
//this method will generate a token for the user
    public static String generateAccessToken(User user) {
        //return a token with the user's id and email
        return Jwts.builder()
            .setSubject(String.format("%s,%s", user.getId(), user.getEmail()))
            //sign the token with the secret key
            .signWith(SignatureAlgorithm.HS512, secret)
            .compact();
    }
}
