package org.acme.openapi.swaggerui;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.openapi.quarkus.apis_guru_openapi_yaml.api.ApisApi;

import jakarta.inject.Inject;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/fruits")
public class FruitResource {

    private Set<Fruit> fruits = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public FruitResource() {
        fruits.add(new Fruit("Apple", "Winter fruit"));
        fruits.add(new Fruit("Pineapple", "Tropical fruit"));
    }

    @Inject
    @RestClient
    ApisApi guruApi;

    @GET
    public Set<Fruit> list() {
        try {
            System.out.println("External REST API result length: " + guruApi.getProviders().toString().length());
        } catch (Exception e) {
            return Set.of();
        }
        return fruits;
    }

    @POST
    public Set<Fruit> add(Fruit fruit) {
        fruits.add(fruit);
        return fruits;
    }

    @DELETE
    public Set<Fruit> delete(Fruit fruit) {
        fruits.removeIf(existingFruit -> existingFruit.name.contentEquals(fruit.name));
        return fruits;
    }
}
