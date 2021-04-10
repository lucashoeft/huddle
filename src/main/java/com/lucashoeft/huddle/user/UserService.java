package com.lucashoeft.huddle.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public void createUser(User newUser) {
        Optional<User> userEmailTaken = userRepository.findUserByUserEmail(newUser.getUserEmail());

        if (userEmailTaken.isPresent()) {
            throw new IllegalStateException("The email adress " + newUser.getUserEmail() + " is already taken");
        }

        Optional<User> userUserNameTaken = userRepository.findUserByUserName(newUser.getUserName());

        if (userUserNameTaken.isPresent()) {
            throw new IllegalStateException("The username " + newUser.getUserName() + " is already taken");
        }

        userRepository.save(newUser);
    }

    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
