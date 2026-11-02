
package com.example.coworking.service;

import com.example.coworking.model.User;
import com.example.coworking.repositary.UserRepositary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepositary userRepositary;

    public UserService(UserRepositary userRepositary) {
        this.userRepositary = userRepositary;
    }

    // Get all users
    public List<User> getAllUsers() {
        return userRepositary.getAllUsers();
    }

    // Get user by ID
    public User getUserById(int userId) {
        return userRepositary.getUserById(userId);
    }

    // Check wallet balance
    public boolean hasSufficientBalance(
            int userId,
            java.math.BigDecimal amount) {

        User user = userRepositary.getUserById(userId);

        return user.getWalletBalance().compareTo(amount) >= 0;
    }

}

