package com.github.miguelbarroso05.workshopmongo.services;

import com.github.miguelbarroso05.workshopmongo.domain.User;
import com.github.miguelbarroso05.workshopmongo.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;


    public List<User> findAll(){
        return userRepository.findAll();
    }
}
