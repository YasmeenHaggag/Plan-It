//package com.example.planIt.controller;
//
//import com.example.planIt.util.TokenService;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletRequest;
//
//@RestController
//public class Controller {
//    @GetMapping("/tourist-only-endpoint")
//    public String touristOnlyEndpoint(HttpServletRequest request) {
//        if (TokenService.isTourist(request)) {
//            return "Welcome, tourist!";
//        }
//        else
//            return null;
////        } else {
////            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
////            System.out.println("Unauthorized");
////            return "Unauthorized";
////        }
//    }
//}
