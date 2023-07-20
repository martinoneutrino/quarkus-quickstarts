package org.acme.security.jwt;

import jakarta.enterprise.context.ApplicationScoped;

import org.jboss.logging.Logger;

import io.quarkus.security.identity.AuthenticationRequestContext;
import io.quarkus.security.identity.IdentityProvider;
import io.quarkus.security.identity.SecurityIdentity;
import io.quarkus.security.runtime.QuarkusPrincipal;
import io.quarkus.security.runtime.QuarkusSecurityIdentity;
import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class AdminRoleIdentityProvider
  implements IdentityProvider<AdminRoleAuthenticationRequest> {

  static final Logger log = Logger.getLogger(AdminRoleIdentityProvider.class);

  @Override
  public Class<AdminRoleAuthenticationRequest> getRequestType() {
    return AdminRoleAuthenticationRequest.class;
  }

  @Override
  public Uni<SecurityIdentity> authenticate(AdminRoleAuthenticationRequest request, AuthenticationRequestContext context) {

    log.info("Granting user Admin role");
    QuarkusSecurityIdentity.Builder builder = QuarkusSecurityIdentity.builder();
    builder.setPrincipal(new QuarkusPrincipal("Admin"));
    builder.addRole("Admin");
    log.info("Admin user and role granted");
    return Uni.createFrom().item(builder.build());
  }
}
