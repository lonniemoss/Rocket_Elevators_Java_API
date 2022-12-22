package com.glory.app.rest.Controller;

import com.glory.app.rest.Models.AuthRequest;
import com.glory.app.rest.Models.AuthenticationResponse;
import com.glory.app.rest.Models.Jwt;
import com.glory.app.rest.Models.User;
import com.glory.app.rest.Repo.UserRepo;
import io.jsonwebtoken.Jwts;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController // This means that this class is a Controller
@RequestMapping("/api") // This means URL's start with /demo (after Application path)
public class AuthenticationController {
    @Autowired
    AuthenticationManager authManager;
    @Autowired
    Jwt jwt;
    @Autowired
    private UserRepo userRepo;

    //post request to authenticate the user
    @RequestMapping(value = "/Authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> authenticate(@RequestBody @Valid AuthRequest request) {
        // retrieve user from database using the unique identifier in the request object
        User user = userRepo.findByEmail(request.getEmail()).orElse(null);
        if (user == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User not found.");
        }
        // generate a token for the user
        String token = jwt.generateAccessToken(user);
        // return the token to the user
        return ResponseEntity.ok(new AuthenticationResponse(Jwts.parser().setSigningKey(Jwt.secret).parseClaimsJws(token).getBody().getSubject(), token));
    }

}
