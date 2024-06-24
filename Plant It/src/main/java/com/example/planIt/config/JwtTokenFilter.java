//package com.example.planIt.config;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//import java.security.SignatureException;
//
//public class JwtTokenFilter extends OncePerRequestFilter {
//
//    private final String secretKey = "C4D66HOPjc"; // Use the same secret key used to sign the JWT
//
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request,
//                                    HttpServletResponse response,
//                                    FilterChain filterChain) throws ServletException, IOException {
//        String header = request.getHeader("Authorization");
//        if (header == null || !header.startsWith("Bearer ")) {
//            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Missing or invalid Authorization header.");
//            return;
//        }
//
//        String token = header.substring(7);
//        Claims claims = Jwts.parser()
//                .setSigningKey(secretKey.getBytes())
//                .parseClaimsJws(token)
//                .getBody();
//
//        if (!"tourist".equals(claims.get("role"))) {
//            response.sendError(HttpServletResponse.SC_FORBIDDEN, "Access denied.");
//            return;
//        }
//
//        // You can set the claims in the request context if needed
//        request.setAttribute("claims", claims);
//
//        filterChain.doFilter(request, response);
//    }
//
//
////    @Override
////    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
////                                    FilterChain filterChain) throws ServletException, IOException {
////        {
////
////        }}
//}
