package com.fu.lei.flog.dto;

@Data
public class UserDto {
    private String userAccount;
    private String userName;
    private String userPwd;
    private Byte userStatus;
    private Timestamp lastLoginTime;
    private String uuid;
}
