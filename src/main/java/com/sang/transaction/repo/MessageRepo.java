package com.sang.transaction.repo;

import com.sang.transaction.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MessageRepo extends JpaRepository<Message, Integer> {
}
