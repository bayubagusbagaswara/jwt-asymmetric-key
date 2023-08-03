package com.bayu.jwt.asymmetric.service.impl;

import com.bayu.jwt.asymmetric.dto.AuthenticationResponse;
import com.bayu.jwt.asymmetric.dto.LoginRequest;
import com.bayu.jwt.asymmetric.dto.RegistrationRequest;
import com.bayu.jwt.asymmetric.dto.RegistrationResponse;
import com.bayu.jwt.asymmetric.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private static final Logger log = LoggerFactory.getLogger(AuthServiceImpl.class);

    @Override
    public RegistrationResponse registration(RegistrationRequest request) {
        return null;
    }

    @Override
    public AuthenticationResponse signIn(LoginRequest request) {
        return null;
    }

}
