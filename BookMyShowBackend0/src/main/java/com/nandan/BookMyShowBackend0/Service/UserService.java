package com.nandan.BookMyShowBackend0.Service;

import com.nandan.BookMyShowBackend0.Dtos.UserRequestDto;
import com.nandan.BookMyShowBackend0.Models.UserEntity;
import com.nandan.BookMyShowBackend0.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service


public class UserService {

    @Autowired
    UserRepository userRepository;

    public String createUser(UserRequestDto userRequestDto){

        //Converted the userRequestDto to UserEntity
        UserEntity userEntity = UserEntity.builder().name(userRequestDto.getName()).mobile(userRequestDto.getMobile()).build();

        try{
            userRepository.save(userEntity);

        }catch(Exception e){
            return "user couldnt be added";
        }
        return "User added sucessfully";
    }
}
