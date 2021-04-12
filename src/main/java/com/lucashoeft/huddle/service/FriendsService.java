package com.lucashoeft.huddle.service;

import com.lucashoeft.huddle.repository.FriendsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendsService {

    private final FriendsRepository friendsRepository;

    @Autowired
    public FriendsService(FriendsRepository friendsRepository) {
        this.friendsRepository = friendsRepository;
    }
}
