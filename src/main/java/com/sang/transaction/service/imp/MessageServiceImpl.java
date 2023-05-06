package com.sang.transaction.service.imp;

import com.sang.transaction.entity.Message;
import com.sang.transaction.repo.MessageRepo;
import com.sang.transaction.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepo messageRepository;

    @Override

    public String SaveMessage() {
        String response = "Message Saved.";
        Message message = new Message("message for user");
        messageRepository.save(message);
        System.out.println(response);
        return response;
    }

}
