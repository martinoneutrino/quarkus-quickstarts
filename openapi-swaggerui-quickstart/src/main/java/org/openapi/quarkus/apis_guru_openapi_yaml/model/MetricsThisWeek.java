package org.openapi.quarkus.apis_guru_openapi_yaml.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * Summary totals for the last 7 days
 **/
public class MetricsThisWeek  {

    /**
      * Summary totals for the last 7 days
     **/
    private Integer added;
    /**
      * Summary totals for the last 7 days
     **/
    private Integer updated;

    /**
    * APIs added in the last week
    * @return added
    **/
    @JsonProperty("added")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getAdded() {
        return added;
    }

    /**
     * Set added
     **/
    public void setAdded(Integer added) {
        this.added = added;
    }

    public MetricsThisWeek added(Integer added) {
        this.added = added;
        return this;
    }

    /**
    * APIs updated in the last week
    * @return updated
    **/
    @JsonProperty("updated")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getUpdated() {
        return updated;
    }

    /**
     * Set updated
     **/
    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    public MetricsThisWeek updated(Integer updated) {
        this.updated = updated;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricsThisWeek {\n");

        sb.append("    added: ").append(toIndentedString(added)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        
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
      * Summary totals for the last 7 days
     **/
    public static class MetricsThisWeekQueryParam  {

        /**
          * Summary totals for the last 7 days
         **/
        @jakarta.ws.rs.QueryParam("added")
        private Integer added;
        /**
          * Summary totals for the last 7 days
         **/
        @jakarta.ws.rs.QueryParam("updated")
        private Integer updated;

        /**
        * APIs added in the last week
        * @return added
        **/
        @JsonProperty("added")
        public Integer getAdded() {
            return added;
        }

        /**
         * Set added
         **/
        public void setAdded(Integer added) {
            this.added = added;
        }

        public MetricsThisWeekQueryParam added(Integer added) {
            this.added = added;
            return this;
        }

        /**
        * APIs updated in the last week
        * @return updated
        **/
        @JsonProperty("updated")
        public Integer getUpdated() {
            return updated;
        }

        /**
         * Set updated
         **/
        public void setUpdated(Integer updated) {
            this.updated = updated;
        }

        public MetricsThisWeekQueryParam updated(Integer updated) {
            this.updated = updated;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MetricsThisWeekQueryParam {\n");

            sb.append("    added: ").append(toIndentedString(added)).append("\n");
            sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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