package kalog.com.vn.learn.controller.business.authorization;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

/**
 * Author Mikorn vietnam
 * Created on 04-Jun-18.
 */

public interface AuthenticationManager {


    Authentication authenticate(Authentication authentication)
            throws AuthenticationException;

    boolean support(Class<?> authencatication);
}



