package org.openapi.quarkus.apis_guru_openapi_yaml.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiVersion  {

    private OffsetDateTime added;
    private OffsetDateTime updated;
    private String swaggerUrl;
    private String swaggerYamlUrl;
    private String link;
    private Object info;
    private Object externalDocs;
    private String openapiVer;

    /**
    * Timestamp when the version was added
    * @return added
    **/
    @JsonProperty("added")
    public OffsetDateTime getAdded() {
        return added;
    }

    /**
     * Set added
     **/
    public void setAdded(OffsetDateTime added) {
        this.added = added;
    }

    public ApiVersion added(OffsetDateTime added) {
        this.added = added;
        return this;
    }

    /**
    * Timestamp when the version was updated
    * @return updated
    **/
    @JsonProperty("updated")
    public OffsetDateTime getUpdated() {
        return updated;
    }

    /**
     * Set updated
     **/
    public void setUpdated(OffsetDateTime updated) {
        this.updated = updated;
    }

    public ApiVersion updated(OffsetDateTime updated) {
        this.updated = updated;
        return this;
    }

    /**
    * URL to OpenAPI definition in JSON format
    * @return swaggerUrl
    **/
    @JsonProperty("swaggerUrl")
    public String getSwaggerUrl() {
        return swaggerUrl;
    }

    /**
     * Set swaggerUrl
     **/
    public void setSwaggerUrl(String swaggerUrl) {
        this.swaggerUrl = swaggerUrl;
    }

    public ApiVersion swaggerUrl(String swaggerUrl) {
        this.swaggerUrl = swaggerUrl;
        return this;
    }

    /**
    * URL to OpenAPI definition in YAML format
    * @return swaggerYamlUrl
    **/
    @JsonProperty("swaggerYamlUrl")
    public String getSwaggerYamlUrl() {
        return swaggerYamlUrl;
    }

    /**
     * Set swaggerYamlUrl
     **/
    public void setSwaggerYamlUrl(String swaggerYamlUrl) {
        this.swaggerYamlUrl = swaggerYamlUrl;
    }

    public ApiVersion swaggerYamlUrl(String swaggerYamlUrl) {
        this.swaggerYamlUrl = swaggerYamlUrl;
        return this;
    }

    /**
    * Link to the individual API entry for this API
    * @return link
    **/
    @JsonProperty("link")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getLink() {
        return link;
    }

    /**
     * Set link
     **/
    public void setLink(String link) {
        this.link = link;
    }

    public ApiVersion link(String link) {
        this.link = link;
        return this;
    }

    /**
    * Copy of `info` section from OpenAPI definition
    * @return info
    **/
    @JsonProperty("info")
    public Object getInfo() {
        return info;
    }

    /**
     * Set info
     **/
    public void setInfo(Object info) {
        this.info = info;
    }

    public ApiVersion info(Object info) {
        this.info = info;
        return this;
    }

    /**
    * Copy of `externalDocs` section from OpenAPI definition
    * @return externalDocs
    **/
    @JsonProperty("externalDocs")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Object getExternalDocs() {
        return externalDocs;
    }

    /**
     * Set externalDocs
     **/
    public void setExternalDocs(Object externalDocs) {
        this.externalDocs = externalDocs;
    }

    public ApiVersion externalDocs(Object externalDocs) {
        this.externalDocs = externalDocs;
        return this;
    }

    /**
    * The value of the `openapi` or `swagger` property of the source definition
    * @return openapiVer
    **/
    @JsonProperty("openapiVer")
    public String getOpenapiVer() {
        return openapiVer;
    }

    /**
     * Set openapiVer
     **/
    public void setOpenapiVer(String openapiVer) {
        this.openapiVer = openapiVer;
    }

    public ApiVersion openapiVer(String openapiVer) {
        this.openapiVer = openapiVer;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiVersion {\n");

        sb.append("    added: ").append(toIndentedString(added)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    swaggerUrl: ").append(toIndentedString(swaggerUrl)).append("\n");
        sb.append("    swaggerYamlUrl: ").append(toIndentedString(swaggerYamlUrl)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("    externalDocs: ").append(toIndentedString(externalDocs)).append("\n");
        sb.append("    openapiVer: ").append(toIndentedString(openapiVer)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ApiVersionQueryParam  {

        @jakarta.ws.rs.QueryParam("added")
        private OffsetDateTime added;
        @jakarta.ws.rs.QueryParam("updated")
        private OffsetDateTime updated;
        @jakarta.ws.rs.QueryParam("swaggerUrl")
        private String swaggerUrl;
        @jakarta.ws.rs.QueryParam("swaggerYamlUrl")
        private String swaggerYamlUrl;
        @jakarta.ws.rs.QueryParam("link")
        private String link;
        @jakarta.ws.rs.QueryParam("info")
        private Object info;
        @jakarta.ws.rs.QueryParam("externalDocs")
        private Object externalDocs;
        @jakarta.ws.rs.QueryParam("openapiVer")
        private String openapiVer;

        /**
        * Timestamp when the version was added
        * @return added
        **/
        @JsonProperty("added")
        public OffsetDateTime getAdded() {
            return added;
        }

        /**
         * Set added
         **/
        public void setAdded(OffsetDateTime added) {
            this.added = added;
        }

        public ApiVersionQueryParam added(OffsetDateTime added) {
            this.added = added;
            return this;
        }

        /**
        * Timestamp when the version was updated
        * @return updated
        **/
        @JsonProperty("updated")
        public OffsetDateTime getUpdated() {
            return updated;
        }

        /**
         * Set updated
         **/
        public void setUpdated(OffsetDateTime updated) {
            this.updated = updated;
        }

        public ApiVersionQueryParam updated(OffsetDateTime updated) {
            this.updated = updated;
            return this;
        }

        /**
        * URL to OpenAPI definition in JSON format
        * @return swaggerUrl
        **/
        @JsonProperty("swaggerUrl")
        public String getSwaggerUrl() {
            return swaggerUrl;
        }

        /**
         * Set swaggerUrl
         **/
        public void setSwaggerUrl(String swaggerUrl) {
            this.swaggerUrl = swaggerUrl;
        }

        public ApiVersionQueryParam swaggerUrl(String swaggerUrl) {
            this.swaggerUrl = swaggerUrl;
            return this;
        }

        /**
        * URL to OpenAPI definition in YAML format
        * @return swaggerYamlUrl
        **/
        @JsonProperty("swaggerYamlUrl")
        public String getSwaggerYamlUrl() {
            return swaggerYamlUrl;
        }

        /**
         * Set swaggerYamlUrl
         **/
        public void setSwaggerYamlUrl(String swaggerYamlUrl) {
            this.swaggerYamlUrl = swaggerYamlUrl;
        }

        public ApiVersionQueryParam swaggerYamlUrl(String swaggerYamlUrl) {
            this.swaggerYamlUrl = swaggerYamlUrl;
            return this;
        }

        /**
        * Link to the individual API entry for this API
        * @return link
        **/
        @JsonProperty("link")
        public String getLink() {
            return link;
        }

        /**
         * Set link
         **/
        public void setLink(String link) {
            this.link = link;
        }

        public ApiVersionQueryParam link(String link) {
            this.link = link;
            return this;
        }

        /**
        * Copy of `info` section from OpenAPI definition
        * @return info
        **/
        @JsonProperty("info")
        public Object getInfo() {
            return info;
        }

        /**
         * Set info
         **/
        public void setInfo(Object info) {
            this.info = info;
        }

        public ApiVersionQueryParam info(Object info) {
            this.info = info;
            return this;
        }

        /**
        * Copy of `externalDocs` section from OpenAPI definition
        * @return externalDocs
        **/
        @JsonProperty("externalDocs")
        public Object getExternalDocs() {
            return externalDocs;
        }

        /**
         * Set externalDocs
         **/
        public void setExternalDocs(Object externalDocs) {
            this.externalDocs = externalDocs;
        }

        public ApiVersionQueryParam externalDocs(Object externalDocs) {
            this.externalDocs = externalDocs;
            return this;
        }

        /**
        * The value of the `openapi` or `swagger` property of the source definition
        * @return openapiVer
        **/
        @JsonProperty("openapiVer")
        public String getOpenapiVer() {
            return openapiVer;
        }

        /**
         * Set openapiVer
         **/
        public void setOpenapiVer(String openapiVer) {
            this.openapiVer = openapiVer;
        }

        public ApiVersionQueryParam openapiVer(String openapiVer) {
            this.openapiVer = openapiVer;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ApiVersionQueryParam {\n");

            sb.append("    added: ").append(toIndentedString(added)).append("\n");
            sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
            sb.append("    swaggerUrl: ").append(toIndentedString(swaggerUrl)).append("\n");
            sb.append("    swaggerYamlUrl: ").append(toIndentedString(swaggerYamlUrl)).append("\n");
            sb.append("    link: ").append(toIndentedString(link)).append("\n");
            sb.append("    info: ").append(toIndentedString(info)).append("\n");
            sb.append("    externalDocs: ").append(toIndentedString(externalDocs)).append("\n");
            sb.append("    openapiVer: ").append(toIndentedString(openapiVer)).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
         * Convert the given object to string with each line indented by 4 spaces
         * (except the first line).
         */
        private static String toIndentedString(Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }
    }
}