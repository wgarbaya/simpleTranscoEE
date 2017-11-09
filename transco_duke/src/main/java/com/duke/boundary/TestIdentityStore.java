package com.duke.boundary;


import static java.util.Arrays.asList;
import static javax.security.enterprise.identitystore.CredentialValidationResult.INVALID_RESULT;

import java.util.HashSet;

import javax.enterprise.context.ApplicationScoped;
import javax.security.enterprise.credential.UsernamePasswordCredential;
import javax.security.enterprise.identitystore.CredentialValidationResult;
import javax.security.enterprise.identitystore.IdentityStore;

@ApplicationScoped
public class TestIdentityStore implements IdentityStore {

    public CredentialValidationResult validate(UsernamePasswordCredential usernamePasswordCredential) {
    	System.out.println("TEst");
        if (usernamePasswordCredential.compareTo("reza", "secret1")) {
            return new CredentialValidationResult("reza", new HashSet<>(asList("foo", "bar")));
        }
        if (usernamePasswordCredential.compareTo("reza2", "secret1")) {
            return new CredentialValidationResult("reza2", new HashSet<>(asList( "bar")));
        }
        return INVALID_RESULT;
    }

}