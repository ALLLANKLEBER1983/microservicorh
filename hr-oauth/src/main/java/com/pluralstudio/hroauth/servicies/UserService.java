package com.pluralstudio.hroauth.servicies;

import com.pluralstudio.hroauth.entities.User;
import com.pluralstudio.hroauth.feignclients.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserFeignClient userFeignClient;

    public User findByEmail(String email) {
        User user = userFeignClient.findByEmail(email).getBody();
        if(user == null){
            throw new IllegalArgumentException("Email not found");
        }
        return user;
    }


}
