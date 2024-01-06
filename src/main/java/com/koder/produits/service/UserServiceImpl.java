package com.koder.produits.service;

import com.koder.produits.model.User;
import com.koder.produits.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Boolean existEmail(String email) {
        Optional <User> userOptional = userRepository.findByEmail(email);
        return userOptional.isPresent();
    }

    @Override
    public User getByEmail(String email) {
        Optional<User> userOptional = userRepository.findByEmail(email);
        return userOptional.orElse(null);
    }

}
