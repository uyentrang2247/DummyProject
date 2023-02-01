package com.unigrad.funiversedummyproject.service.implement;

import com.unigrad.funiversedummyproject.domain.Group;
import com.unigrad.funiversedummyproject.service.IGroupService;

import java.util.List;
import java.util.Optional;

public class GroupService implements IGroupService {
    @Override
    public List<Group> getAll() {
        return null;
    }

    @Override
    public Optional<Group> getById(String key) {
        return Optional.empty();
    }

    @Override
    public Group save(Group entity) {
        return null;
    }

    @Override
    public void deleteById(String key) {

    }
}
