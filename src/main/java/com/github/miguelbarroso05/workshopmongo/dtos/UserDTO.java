package com.github.miguelbarroso05.workshopmongo.dtos;

import com.github.miguelbarroso05.workshopmongo.domain.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {
    private String id;
    private String name;
    private String email;
    public UserDTO(User user){
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
    }
}
