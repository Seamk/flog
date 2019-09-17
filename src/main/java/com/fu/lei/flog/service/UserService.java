package com.fu.lei.flog.service;

import com.fu.lei.flog.dto.UserDto;
import com.fu.lei.flog.entity.FlogUserEntity;
import com.fu.lei.flog.repository.FlogUserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private FlogUserRepository flogUserRepository;

    public void check(UserDto userDto) {
        FlogUserEntity flogUserEntity = new FlogUserEntity();
        BeanUtils.copyProperties(flogUserEntity,userDto);
    }
}
