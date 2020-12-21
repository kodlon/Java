package org.igorchuchman.mapper;

import org.igorchuchman.dto.UserDTO;
import org.igorchuchman.entity.Game;
import org.igorchuchman.entity.User;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserToUserDTOMapper {
    public User toEntity(final UserDTO userDTO){
        final  User user = new User();

        user.setId(userDTO.getId());
        user.setUserName(userDTO.getUserName());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName((userDTO.getLastName()));
        user.setBirth(userDTO.getBirth());
        user.setCountComments(userDTO.getCountComments());

        user.setUserGameComment(userDTO.getUserGameComment());

        return user;
    }

    public UserDTO toDTO(final User user){
        final  UserDTO userDTO = new UserDTO();

        userDTO.setId(user.getId());
        userDTO.setUserName(user.getUserName());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setBirth(user.getBirth());
        userDTO.setCountComments(user.getCountComments());

        userDTO.setUserGameComment(user.getUserGameComment());

        return  userDTO;
    }
}
