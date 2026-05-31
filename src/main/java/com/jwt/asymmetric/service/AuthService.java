package com.jwt.asymmetric.service;

import com.jwt.asymmetric.dto.AuthenticationResponse;
import com.jwt.asymmetric.dto.LoginRequest;
import com.jwt.asymmetric.dto.RegistrationRequest;
import com.jwt.asymmetric.dto.RegistrationResponse;

public interface AuthService {

    RegistrationResponse registration(RegistrationRequest request);

    AuthenticationResponse signIn(LoginRequest request);

}
