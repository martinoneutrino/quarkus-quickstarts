package org.openapi.quarkus.apis_guru_openapi_yaml.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.openapi.quarkus.apis_guru_openapi_yaml.model.ApiVersion;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * Meta information about API
 **/
public class API  {

    /**
      * Meta information about API
     **/
    private OffsetDateTime added;
    /**
      * Meta information about API
     **/
    private String preferred;
    /**
      * Meta information about API
     **/
    private Map<String, ApiVersion> versions = new HashMap<>();

    /**
    * Timestamp when the API was first added to the directory
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

    public API added(OffsetDateTime added) {
        this.added = added;
        return this;
    }

    /**
    * Recommended version
    * @return preferred
    **/
    @JsonProperty("preferred")
    public String getPreferred() {
        return preferred;
    }

    /**
     * Set preferred
     **/
    public void setPreferred(String preferred) {
        this.preferred = preferred;
    }

    public API preferred(String preferred) {
        this.preferred = preferred;
        return this;
    }

    /**
    * List of supported versions of the API
    * @return versions
    **/
    @JsonProperty("versions")
    public Map<String, ApiVersion> getVersions() {
        return versions;
    }

    /**
     * Set versions
     **/
    public void setVersions(Map<String, ApiVersion> versions) {
        this.versions = versions;
    }

    public API versions(Map<String, ApiVersion> versions) {
        this.versions = versions;
        return this;
    }
    public API putVersionsItem(String key, ApiVersion versionsItem) {
           if (this.versions == null){
                versions = new HashMap<>();
            }
        this.versions.put(key, versionsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class API {\n");

        sb.append("    added: ").append(toIndentedString(added)).append("\n");
        sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
        
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
    /**
      * Meta information about API
     **/
    public static class APIQueryParam  {

        /**
          * Meta information about API
         **/
        @jakarta.ws.rs.QueryParam("added")
        private OffsetDateTime added;
        /**
          * Meta information about API
         **/
        @jakarta.ws.rs.QueryParam("preferred")
        private String preferred;
        /**
          * Meta information about API
         **/
        @jakarta.ws.rs.QueryParam("versions")
        private Map<String, ApiVersion> versions = null;

        /**
        * Timestamp when the API was first added to the directory
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

        public APIQueryParam added(OffsetDateTime added) {
            this.added = added;
            return this;
        }

        /**
        * Recommended version
        * @return preferred
        **/
        @JsonProperty("preferred")
        public String getPreferred() {
            return preferred;
        }

        /**
         * Set preferred
         **/
        public void setPreferred(String preferred) {
            this.preferred = preferred;
        }

        public APIQueryParam preferred(String preferred) {
            this.preferred = preferred;
            return this;
        }

        /**
        * List of supported versions of the API
        * @return versions
        **/
        @JsonProperty("versions")
        public Map<String, ApiVersion> getVersions() {
            return versions;
        }

        /**
         * Set versions
         **/
        public void setVersions(Map<String, ApiVersion> versions) {
            this.versions = versions;
        }

        public APIQueryParam versions(Map<String, ApiVersion> versions) {
            this.versions = versions;
            return this;
        }
        public APIQueryParam putVersionsItem(String key, ApiVersion versionsItem) {
            this.versions.put(key, versionsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class APIQueryParam {\n");

            sb.append("    added: ").append(toIndentedString(added)).append("\n");
            sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
            sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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