package com.lucashoeft.huddle.config;

import com.lucashoeft.huddle.model.Event;
import com.lucashoeft.huddle.repository.EventRepository;
import com.lucashoeft.huddle.model.friendRequest.FriendRequest;
import com.lucashoeft.huddle.model.friendRequest.FriendRequestId;
import com.lucashoeft.huddle.repository.FriendRequestRepository;
import com.lucashoeft.huddle.model.friends.Friends;
import com.lucashoeft.huddle.model.friends.FriendsId;
import com.lucashoeft.huddle.repository.FriendsRepository;
import com.lucashoeft.huddle.model.Image;
import com.lucashoeft.huddle.repository.ImageRepository;
import com.lucashoeft.huddle.model.invitation.Invitation;
import com.lucashoeft.huddle.model.invitation.InvitationId;
import com.lucashoeft.huddle.repository.InvitationRepository;
import com.lucashoeft.huddle.model.invitation.InvitationStatus;
import com.lucashoeft.huddle.model.User;
import com.lucashoeft.huddle.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            UserRepository userRepository,
            ImageRepository imageRepository,
            EventRepository eventRepository,
            InvitationRepository invitationRepository,
            FriendsRepository friendsRepository,
            FriendRequestRepository friendRequestRepository) {
        return args -> {
            User user1 = new User(
                    "luka",
                    "luka123@gmail.com",
                    "luka456",
                    LocalDateTime.of(2021,Month.APRIL,7,18,2)
            );
            User user2 = new User(
                    "ben",
                    "benqwertz@gmail.com",
                    "benasdf",
                    LocalDateTime.of(2021,Month.APRIL,7,18,8)
            );
            User user3 = new User(
                    "clara",
                    "clara98@gmail.com",
                    "yxclarayx",
                    LocalDateTime.of(2021,Month.APRIL,7,23,50)
            );

            Image image1 = new Image(1L,"google.com");

            Event event1 = new Event(user1,"Volleyball",52.442651,13.216047,"Spielen bestimmt noch 2 Stunden!", image1,LocalDateTime.of(2021,Month.APRIL,7,18,51));

            Invitation invitation1 = new Invitation(new InvitationId(1L,1L), InvitationStatus.OPEN);

            Friends friends1 = new Friends(new FriendsId(1L,2L));

            FriendRequest friendRequest1 = new FriendRequest(new FriendRequestId(1L,3L),LocalDateTime.of(2021,Month.APRIL,7,23,59));

            userRepository.saveAll(
                    List.of(user1, user2, user3)
            );

            imageRepository.saveAll(
                    List.of(image1)
            );

            eventRepository.saveAll(
                    List.of(event1)
            );

            invitationRepository.saveAll(
                    List.of(invitation1)
            );

            friendsRepository.saveAll(
                    List.of(friends1)
            );

            friendRequestRepository.saveAll(
                    List.of(friendRequest1)
            );
        };
    }

}
