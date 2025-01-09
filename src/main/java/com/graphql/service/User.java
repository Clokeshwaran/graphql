//package com.graphql.service;
//
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//
//@Service
//@RequiredArgsConstructor
//public class User implements UserDetailsService {
//
////    @Autowired
////    UserEntityRepository userEntityRepository;
////    @Autowired
////    SellerEntityRepository sellerEntityRepository;
//
//
//    @Override
//    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
//
//        String username = "lokesh";
//        String password = "Lokesh";
//        String role = "User";
//
//        return org.springframework.security.core.userdetails.User.builder()
//                .username(username)
//                .password(password)
//                .roles(role)
//                .build();
//    }
//}