package org.openapi.quarkus.apis_guru_openapi_yaml.api;

import org.openapi.quarkus.apis_guru_openapi_yaml.model.API;
import org.openapi.quarkus.apis_guru_openapi_yaml.model.GetProviders200Response;
import org.openapi.quarkus.apis_guru_openapi_yaml.model.GetServices200Response;
import org.openapi.quarkus.apis_guru_openapi_yaml.model.Metrics;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import jakarta.enterprise.context.ApplicationScoped;

import io.quarkiverse.openapi.generator.annotations.GeneratedClass;
import io.quarkiverse.openapi.generator.annotations.GeneratedMethod;
import io.quarkiverse.openapi.generator.annotations.GeneratedParam;

/**
  * APIs.guru
  * <p>Wikipedia for Web APIs. Repository of API definitions in OpenAPI format. **Warning**: If you want to be notified about changes in advance please join our [Slack channel](https://join.slack.com/t/mermade/shared_invite/zt-g78g7xir-MLE_CTCcXCdfJfG3CJe9qA). Client sample: [[Demo]](https://apis.guru/simple-ui) [[Repo]](https://github.com/APIs-guru/simple-ui) </p>
  */
@Path("")
@RegisterRestClient(baseUri = "https://api.apis.guru/v2", configKey="apis_guru_openapi_yaml")
@GeneratedClass(value="apis.guru.openapi.yaml", tag = "Apis")
@ApplicationScoped
public interface ApisApi {

     /**
     * Retrieve one version of a particular API
     *
     * Returns the API entry for one specific version of an API where there is no serviceName.
     *
     * @param provider 
     * @param api 
     */
    @GET
    @Path("/specs/{provider}/{api}.json")
    @Produces({"application/json"})
    @GeneratedMethod ("getAPI")
    public API getAPI(
        @GeneratedParam("provider") @PathParam("provider") String provider
, @GeneratedParam("api") @PathParam("api") String api

    );

     /**
     * Get basic metrics
     *
     * Some basic metrics for the entire directory. Just stunning numbers to put on a front page and are intended purely for WoW effect :) 
     *
     */
    @GET
    @Path("/metrics.json")
    @Produces({"application/json"})
    @GeneratedMethod ("getMetrics")
    public Metrics getMetrics(
        
    );

     /**
     * List all APIs for a particular provider
     *
     * List all APIs in the directory for a particular providerName Returns links to the individual API entry for each API. 
     *
     * @param provider 
     */
    @GET
    @Path("/{provider}.json")
    @Produces({"application/json"})
    @GeneratedMethod ("getProvider")
    public Map<String, API> getProvider(
        @GeneratedParam("provider") @PathParam("provider") String provider

    );

     /**
     * List all providers
     *
     * List all the providers in the directory 
     *
     */
    @GET
    @Path("/providers.json")
    @Produces({"application/json"})
    @GeneratedMethod ("getProviders")
    public GetProviders200Response getProviders(
        
    );

     /**
     * Retrieve one version of a particular API with a serviceName.
     *
     * Returns the API entry for one specific version of an API where there is a serviceName.
     *
     * @param provider 
     * @param service 
     * @param api 
     */
    @GET
    @Path("/specs/{provider}/{service}/{api}.json")
    @Produces({"application/json"})
    @GeneratedMethod ("getServiceAPI")
    public API getServiceAPI(
        @GeneratedParam("provider") @PathParam("provider") String provider
, @GeneratedParam("service") @PathParam("service") String service
, @GeneratedParam("api") @PathParam("api") String api

    );

     /**
     * List all serviceNames for a particular provider
     *
     * List all serviceNames in the directory for a particular providerName 
     *
     * @param provider 
     */
    @GET
    @Path("/{provider}/services.json")
    @Produces({"application/json"})
    @GeneratedMethod ("getServices")
    public GetServices200Response getServices(
        @GeneratedParam("provider") @PathParam("provider") String provider

    );

     /**
     * List all APIs
     *
     * List all APIs in the directory. Returns links to the OpenAPI definitions for each API in the directory. If API exist in multiple versions `preferred` one is explicitly marked. Some basic info from the OpenAPI definition is cached inside each object. This allows you to generate some simple views without needing to fetch the OpenAPI definition for each API. 
     *
     */
    @GET
    @Path("/list.json")
    @Produces({"application/json"})
    @GeneratedMethod ("listAPIs")
    public Map<String, API> listAPIs(
        
    );

}
