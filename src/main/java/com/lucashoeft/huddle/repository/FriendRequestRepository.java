package com.lucashoeft.huddle.repository;

import com.lucashoeft.huddle.model.friendRequest.FriendRequest;
import com.lucashoeft.huddle.model.friendRequest.FriendRequestId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRequestRepository extends JpaRepository<FriendRequest, FriendRequestId> {
}
