package com.github.miguelbarroso05.workshopmongo.resources;

import com.github.miguelbarroso05.workshopmongo.domain.User;
import com.github.miguelbarroso05.workshopmongo.dtos.UserDTO;
import com.github.miguelbarroso05.workshopmongo.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserResource {

    private final UserService userService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UserDTO> findAll(){
       List<User> userList =  userService.findAll();
       List<UserDTO> userDTOList =
        userList.stream().map(user -> new UserDTO(user)).collect(Collectors.toList());
       return userDTOList;
    }
}
