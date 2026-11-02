
package com.example.coworking.service;

import com.example.coworking.model.WorkSpace;
import com.example.coworking.repositary.WorkspaceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkspaceService {

    private final WorkspaceRepository workspaceRepository;

    public WorkspaceService(WorkspaceRepository WorkspaceRepository) {
        this.workspaceRepository = WorkspaceRepository;
    }

    // Get all active workspaces
    public List<WorkSpace> getAllActiveWorkspaces() {
        return workspaceRepository.getAllActiveWorkspaces();
    }

    // Get workspace by ID
    public WorkSpace getWorkspaceById(int spaceId) {
        return workspaceRepository.getWorkspaceById(spaceId);
    }
}

