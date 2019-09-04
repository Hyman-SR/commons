package com.hyman.web.commons.utils.extra;


public class UserServiceImpl<S> implements UserService<S>, RoleService<Double, Integer, Character> {
    @Override
    public User getOne() {
        return new User();
    }
}
