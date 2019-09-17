package com.fu.lei.flog.repository;

import com.fu.lei.flog.entity.FlogTaskEntity;
import org.springframework.data.repository.Repository;

public interface FlogTaskRepository extends Repository<FlogTaskEntity,Long> {
    public void save(FlogTaskEntity flogTaskEntity);
}
