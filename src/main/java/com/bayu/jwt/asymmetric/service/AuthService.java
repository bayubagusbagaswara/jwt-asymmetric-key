package com.bayu.jwt.asymmetric.service;

import com.bayu.jwt.asymmetric.dto.AuthenticationResponse;
import com.bayu.jwt.asymmetric.dto.LoginRequest;
import com.bayu.jwt.asymmetric.dto.RegistrationRequest;
import com.bayu.jwt.asymmetric.dto.RegistrationResponse;

public interface AuthService {

    RegistrationResponse registration(RegistrationRequest request);

    AuthenticationResponse signIn(LoginRequest request);

}
