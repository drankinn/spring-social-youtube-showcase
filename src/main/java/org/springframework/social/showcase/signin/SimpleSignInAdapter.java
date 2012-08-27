package org.springframework.social.showcase.signin;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.web.SignInAdapter;
import org.springframework.web.context.request.NativeWebRequest;

import javax.inject.Inject;

/**
 * User: lancea10
 * Date: 8/13/12
 * Time: 7:14 PM
 */
public class SimpleSignInAdapter implements SignInAdapter {

    private final RequestCache requestCache;

    @Inject
    public SimpleSignInAdapter(RequestCache requestCache){
        this.requestCache = requestCache;
    }

    @Override
    public String signIn(String userId, Connection<?> connection, NativeWebRequest request) {
        SecurityContextHolder.getContext().setAuthentication(new UsernamePasswordAuthenticationToken(userId, null, null));
        return "";
    }
}
