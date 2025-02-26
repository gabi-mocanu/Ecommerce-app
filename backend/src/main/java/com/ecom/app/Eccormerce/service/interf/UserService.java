package com.ecom.app.Eccormerce.service.interf;

import com.ecom.app.Eccormerce.dto.LoginRequest;
import com.ecom.app.Eccormerce.dto.Response;
import com.ecom.app.Eccormerce.dto.UserDto;
import com.ecom.app.Eccormerce.entity.User;

public interface UserService {
    Response registerUser(UserDto registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    User getLoginUser();
    Response getUserInfoAndOrderHistory();
}
