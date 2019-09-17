package com.example.usersMessage.repos;

import com.example.usersMessage.models.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvatarRepo extends JpaRepository<Avatar, Long> {
}
