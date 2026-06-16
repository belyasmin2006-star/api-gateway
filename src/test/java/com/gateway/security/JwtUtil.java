package com.gateway.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import java.util.Date;

public class JwtUtil {

    private final String SECRET =
            "mysecretkeymysecretkeymysecretkey12";

    // generate token
    public String generateToken(String username) {

        return Jwts.builder()

                .setSubject(username)

                .setIssuedAt(new Date())

                .setExpiration(
                        new Date(System.currentTimeMillis() + 1000 * 60 * 60)
                )

                .signWith(
                        Keys.hmacShaKeyFor(
                                SECRET.getBytes()
                        )
                )

                .compact();

    }

    // extract username
    public String extractUsername(String token) {

        Claims claims = Jwts.parserBuilder()

                .setSigningKey(
                        Keys.hmacShaKeyFor(
                                SECRET.getBytes()
                        )
                )

                .build()

                .parseClaimsJws(token)

                .getBody();

        return claims.getSubject();

    }

    // validate token
    public boolean validateToken(String token) {

        try {

            Jwts.parserBuilder()

                    .setSigningKey(
                            Keys.hmacShaKeyFor(
                                    SECRET.getBytes()
                            )
                    )

                    .build()

                    .parseClaimsJws(token);

            return true;

        } catch (Exception e) {

            return false;

        }

    }

}