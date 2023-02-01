package com.unigrad.funiversedummyproject.repository;

import com.unigrad.funiversedummyproject.domain.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, String> {
}
