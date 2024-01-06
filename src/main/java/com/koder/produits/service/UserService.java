package com.koder.produits.service;


import com.koder.produits.model.User;

public interface UserService {
    User saveUser(User user);
    Boolean existEmail(String email);
    User getByEmail(String email);
}
