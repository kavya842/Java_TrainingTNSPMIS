
package com.example.coworking.repositary;

import com.example.coworking.mapper.UserRowMapper;
import com.example.coworking.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositary {

    private final JdbcTemplate jdbcTemplate;

    public UserRepositary(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Get all users
    public List<User> getAllUsers() {

        String sql = "SELECT * FROM users";

        return jdbcTemplate.query(sql, new UserRowMapper());
    }

    // Get user by ID
    public User getUserById(int userId) {

        String sql = "SELECT * FROM users WHERE user_id = ?";

        return jdbcTemplate.queryForObject(
                sql,
                new UserRowMapper(),
                userId
        );

    }

    // Update user wallet balance
    public int updateWalletBalance(int userId, java.math.BigDecimal newBalance) {

        String sql = "UPDATE users SET wallet_balance = ? WHERE user_id = ?";

        return jdbcTemplate.update(sql, newBalance, userId);
    }

}
