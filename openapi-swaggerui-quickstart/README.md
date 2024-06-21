Quarkus guide: https://quarkus.io/guides/openapi-swaggerui

This sample project demonstrates that setting a default URI using `quarkus.rest-client.*.uri` will override the URI set on either `@RegisterRestClient`'s `baseUri`, or the URI set through the `configKey` value in `application.properties`` (eg. `quarkus.rest-client.apis_guru_openapi_yaml.uri`).

Only using the fully qualified class name (eg. `quarkus.rest-client."org.openapi.quarkus.apis_guru_openapi_yaml.api.ApisApi".uri`) is able to override the default URI set using `quarkus.rest-client.*.uri`.
