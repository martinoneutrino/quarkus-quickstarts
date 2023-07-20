package org.acme.security.jwt;

import io.quarkus.security.credential.PasswordCredential;
import io.quarkus.security.identity.request.UsernamePasswordAuthenticationRequest;

public class AdminRoleAuthenticationRequest
  extends UsernamePasswordAuthenticationRequest {

  public AdminRoleAuthenticationRequest(String username, PasswordCredential password) {
    super(username, password);
  }

}
