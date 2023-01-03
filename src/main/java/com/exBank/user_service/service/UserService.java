package com.exBank.user_service.service;

import com.exBank.user_service.dto.UserRequest;
import com.exBank.user_service.model.User;

public interface UserService {
    User createUser(UserRequest userRequest);

    User getUserById(Long userId);

    User updateUser(Long userId, UserRequest userRequest);

    void deleteUser(Long userId);
}
