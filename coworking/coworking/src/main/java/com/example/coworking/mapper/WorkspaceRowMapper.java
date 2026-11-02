
package com.example.coworking.mapper;

import com.example.coworking.model.WorkSpace;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class WorkspaceRowMapper implements RowMapper<WorkSpace> {

    @Override
    public WorkSpace mapRow(ResultSet rs, int rowNum) throws SQLException {

        WorkSpace workspace = new WorkSpace();

        workspace.setSpaceId(rs.getInt("space_id"));
        workspace.setSpaceName(rs.getString("space_name"));
        workspace.setSpaceType(rs.getString("space_type"));
        workspace.setHourlyRate(rs.getBigDecimal("hourly_rate"));
        workspace.setActive(rs.getBoolean("is_active"));

        return workspace;
    }
}

