package com.fu.lei.flog.repository;

import com.fu.lei.flog.entity.FlogUserEntity;
import org.springframework.data.repository.Repository;

public interface FlogUserRepository extends Repository<FlogUserEntity,Long> {
    public int findByUserAccountAndUserPwd(FlogUserEntity flogUserEntity);
}
