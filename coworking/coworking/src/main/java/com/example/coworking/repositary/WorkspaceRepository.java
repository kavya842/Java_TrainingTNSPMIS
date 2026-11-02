
package com.example.coworking.repositary;

import com.example.coworking.mapper.WorkspaceRowMapper;
import com.example.coworking.model.WorkSpace;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WorkspaceRepository {

    private final JdbcTemplate jdbcTemplate;

    public WorkspaceRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Get all active workspaces
    public List<WorkSpace> getAllActiveWorkspaces() {

        String sql = "SELECT * FROM workspaces WHERE is_active = true";

        return jdbcTemplate.query(
                sql,
                new WorkspaceRowMapper()
        );
    }

    // Get workspace by ID
    public WorkSpace getWorkspaceById(int spaceId) {

        String sql = "SELECT * FROM workspaces WHERE space_id = ?";

        return jdbcTemplate.queryForObject(
                sql,
                new WorkspaceRowMapper(),
                spaceId
        );
    }
}
