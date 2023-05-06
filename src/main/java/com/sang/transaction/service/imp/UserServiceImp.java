package com.sang.transaction.service.imp;

import com.sang.transaction.entity.Message;
import com.sang.transaction.entity.User;
import com.sang.transaction.repo.UserRepo;
import com.sang.transaction.service.MessageService;
import com.sang.transaction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service

public class UserServiceImp implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private MessageService messageService;


    @Override
    @Transactional(rollbackFor = NullPointerException.class)
    public String saveUser() throws Exception {
        try {
            String response = "User and Message saved";
            User user = new User("sang");
            messageService = null;
            userRepo.save(user);
            messageService.SaveMessage();
            System.out.println("user saved");
            return response;
        } catch (Exception e) {
            throw new Exception();
        }
    }

}
