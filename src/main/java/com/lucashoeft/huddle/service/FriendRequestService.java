package com.lucashoeft.huddle.service;

import com.lucashoeft.huddle.repository.FriendRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendRequestService {

    private final FriendRequestRepository friendRequestRepository;

    @Autowired
    public FriendRequestService(FriendRequestRepository friendRequestRepository) {
        this.friendRequestRepository = friendRequestRepository;
    }
}
