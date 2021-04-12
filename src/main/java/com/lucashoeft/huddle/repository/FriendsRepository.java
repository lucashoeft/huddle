package com.lucashoeft.huddle.repository;

import com.lucashoeft.huddle.model.friends.Friends;
import com.lucashoeft.huddle.model.friends.FriendsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendsRepository extends JpaRepository<Friends, FriendsId> {
}
