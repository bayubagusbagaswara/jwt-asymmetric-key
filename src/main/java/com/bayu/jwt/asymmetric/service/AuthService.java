package com.bayu.jwt.asymmetric.service;

import com.bayu.jwt.asymmetric.dto.RegistrationRequest;
import com.bayu.jwt.asymmetric.dto.RegistrationResponse;

public interface AuthService {

    RegistrationResponse registration(RegistrationRequest request);

}
