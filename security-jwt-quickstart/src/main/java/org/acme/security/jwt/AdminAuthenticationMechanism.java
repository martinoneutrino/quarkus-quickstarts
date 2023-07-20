package org.acme.security.jwt;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import jakarta.inject.Singleton;

import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.quarkus.security.credential.PasswordCredential;
import io.quarkus.security.identity.IdentityProviderManager;
import io.quarkus.security.identity.SecurityIdentity;
import io.quarkus.security.identity.request.AuthenticationRequest;
import io.quarkus.vertx.http.runtime.security.ChallengeData;
import io.quarkus.vertx.http.runtime.security.HttpAuthenticationMechanism;
import io.quarkus.vertx.http.runtime.security.HttpCredentialTransport;
import io.quarkus.vertx.http.runtime.security.HttpSecurityUtils;
import io.smallrye.mutiny.Uni;
import io.vertx.ext.web.RoutingContext;

@Singleton
public class AdminAuthenticationMechanism
  implements HttpAuthenticationMechanism {

    private static final String ADMIN = "Admin";

    @Override
    public Uni<SecurityIdentity> authenticate(RoutingContext context, IdentityProviderManager identityProviderManager) {
      // similar to BasicAuthenticationMechanism
      List<String> authHeaders = context.request().headers().getAll(HttpHeaderNames.AUTHORIZATION);
      if (authHeaders != null) {
        for (String current : authHeaders) {
          if (current.startsWith(ADMIN + " ")) {

            AdminRoleAuthenticationRequest credential = new AdminRoleAuthenticationRequest("admin", new PasswordCredential("admin_password".toCharArray()));
            HttpSecurityUtils.setRoutingContextAttribute(credential, context);
            context.put(AdminAuthenticationMechanism.class.getName(), this);

            return identityProviderManager.authenticate(credential);
          }
        }
      }
      // No suitable header has been found in this request,
      return Uni.createFrom().optional(Optional.empty());
    }

    @Override
    public Uni<ChallengeData> getChallenge(RoutingContext context) {
      ChallengeData result = new ChallengeData(
              HttpResponseStatus.UNAUTHORIZED.code(),
              HttpHeaderNames.WWW_AUTHENTICATE,
              ADMIN);
      return Uni.createFrom().item(result);
    }

    @Override
    public Set<Class<? extends AuthenticationRequest>> getCredentialTypes() {
        return Collections.singleton(AdminRoleAuthenticationRequest.class);
    }

    @Override
    public Uni<HttpCredentialTransport> getCredentialTransport(RoutingContext context) {
        return Uni.createFrom().item(new HttpCredentialTransport(HttpCredentialTransport.Type.AUTHORIZATION, ADMIN));
    }

    @Override
    public int getPriority() {
        return 2010; //basic auth is 2000
    }
}