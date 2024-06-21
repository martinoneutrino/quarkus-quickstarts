package org.openapi.quarkus.apis_guru_openapi_yaml.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetServices200Response  {

    private List<String> data;

    /**
    * Get data
    * @return data
    **/
    @JsonProperty("data")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<String> getData() {
        return data;
    }

    /**
     * Set data
     **/
    public void setData(List<String> data) {
        this.data = data;
    }

    public GetServices200Response data(List<String> data) {
        this.data = data;
        return this;
    }
    public GetServices200Response addDataItem(String dataItem) {
        if (this.data == null){
            data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetServices200Response {\n");

        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        
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
    public static class GetServices200ResponseQueryParam  {

        @jakarta.ws.rs.QueryParam("data")
        private List<String> data = null;

        /**
        * Get data
        * @return data
        **/
        @JsonProperty("data")
        public List<String> getData() {
            return data;
        }

        /**
         * Set data
         **/
        public void setData(List<String> data) {
            this.data = data;
        }

        public GetServices200ResponseQueryParam data(List<String> data) {
            this.data = data;
            return this;
        }
        public GetServices200ResponseQueryParam addDataItem(String dataItem) {
            this.data.add(dataItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GetServices200ResponseQueryParam {\n");

            sb.append("    data: ").append(toIndentedString(data)).append("\n");
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