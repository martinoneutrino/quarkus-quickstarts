package org.openapi.quarkus.apis_guru_openapi_yaml.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapi.quarkus.apis_guru_openapi_yaml.model.MetricsThisWeek;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * List of basic metrics
 **/
public class Metrics  {

    /**
      * List of basic metrics
     **/
    private Integer numSpecs;
    /**
      * List of basic metrics
     **/
    private Integer numAPIs;
    /**
      * List of basic metrics
     **/
    private Integer numEndpoints;
    /**
      * List of basic metrics
     **/
    private Integer unreachable;
    /**
      * List of basic metrics
     **/
    private Integer invalid;
    /**
      * List of basic metrics
     **/
    private Integer unofficial;
    /**
      * List of basic metrics
     **/
    private Integer fixes;
    /**
      * List of basic metrics
     **/
    private Integer fixedPct;
    /**
      * List of basic metrics
     **/
    private List<Object> datasets;
    /**
      * List of basic metrics
     **/
    private Integer stars;
    /**
      * List of basic metrics
     **/
    private Integer issues;
    /**
      * List of basic metrics
     **/
    private MetricsThisWeek thisWeek;
    /**
      * List of basic metrics
     **/
    private Integer numDrivers;
    /**
      * List of basic metrics
     **/
    private Integer numProviders;

    /**
    * Number of API definitions including different versions of the same API
    * minimum: 1
    * @return numSpecs
    **/
    @JsonProperty("numSpecs")
    public Integer getNumSpecs() {
        return numSpecs;
    }

    /**
     * Set numSpecs
     **/
    public void setNumSpecs(Integer numSpecs) {
        this.numSpecs = numSpecs;
    }

    public Metrics numSpecs(Integer numSpecs) {
        this.numSpecs = numSpecs;
        return this;
    }

    /**
    * Number of unique APIs
    * minimum: 1
    * @return numAPIs
    **/
    @JsonProperty("numAPIs")
    public Integer getNumAPIs() {
        return numAPIs;
    }

    /**
     * Set numAPIs
     **/
    public void setNumAPIs(Integer numAPIs) {
        this.numAPIs = numAPIs;
    }

    public Metrics numAPIs(Integer numAPIs) {
        this.numAPIs = numAPIs;
        return this;
    }

    /**
    * Total number of endpoints inside all definitions
    * minimum: 1
    * @return numEndpoints
    **/
    @JsonProperty("numEndpoints")
    public Integer getNumEndpoints() {
        return numEndpoints;
    }

    /**
     * Set numEndpoints
     **/
    public void setNumEndpoints(Integer numEndpoints) {
        this.numEndpoints = numEndpoints;
    }

    public Metrics numEndpoints(Integer numEndpoints) {
        this.numEndpoints = numEndpoints;
        return this;
    }

    /**
    * Number of unreachable (4XX,5XX status) APIs
    * @return unreachable
    **/
    @JsonProperty("unreachable")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getUnreachable() {
        return unreachable;
    }

    /**
     * Set unreachable
     **/
    public void setUnreachable(Integer unreachable) {
        this.unreachable = unreachable;
    }

    public Metrics unreachable(Integer unreachable) {
        this.unreachable = unreachable;
        return this;
    }

    /**
    * Number of newly invalid APIs
    * @return invalid
    **/
    @JsonProperty("invalid")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getInvalid() {
        return invalid;
    }

    /**
     * Set invalid
     **/
    public void setInvalid(Integer invalid) {
        this.invalid = invalid;
    }

    public Metrics invalid(Integer invalid) {
        this.invalid = invalid;
        return this;
    }

    /**
    * Number of unofficial APIs
    * @return unofficial
    **/
    @JsonProperty("unofficial")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getUnofficial() {
        return unofficial;
    }

    /**
     * Set unofficial
     **/
    public void setUnofficial(Integer unofficial) {
        this.unofficial = unofficial;
    }

    public Metrics unofficial(Integer unofficial) {
        this.unofficial = unofficial;
        return this;
    }

    /**
    * Total number of fixes applied across all APIs
    * @return fixes
    **/
    @JsonProperty("fixes")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getFixes() {
        return fixes;
    }

    /**
     * Set fixes
     **/
    public void setFixes(Integer fixes) {
        this.fixes = fixes;
    }

    public Metrics fixes(Integer fixes) {
        this.fixes = fixes;
        return this;
    }

    /**
    * Percentage of all APIs where auto fixes have been applied
    * @return fixedPct
    **/
    @JsonProperty("fixedPct")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getFixedPct() {
        return fixedPct;
    }

    /**
     * Set fixedPct
     **/
    public void setFixedPct(Integer fixedPct) {
        this.fixedPct = fixedPct;
    }

    public Metrics fixedPct(Integer fixedPct) {
        this.fixedPct = fixedPct;
        return this;
    }

    /**
    * Data used for charting etc
    * @return datasets
    **/
    @JsonProperty("datasets")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Object> getDatasets() {
        return datasets;
    }

    /**
     * Set datasets
     **/
    public void setDatasets(List<Object> datasets) {
        this.datasets = datasets;
    }

    public Metrics datasets(List<Object> datasets) {
        this.datasets = datasets;
        return this;
    }
    public Metrics addDatasetsItem(Object datasetsItem) {
        if (this.datasets == null){
            datasets = new ArrayList<>();
        }
        this.datasets.add(datasetsItem);
        return this;
    }

    /**
    * GitHub stars for our main repo
    * @return stars
    **/
    @JsonProperty("stars")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getStars() {
        return stars;
    }

    /**
     * Set stars
     **/
    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public Metrics stars(Integer stars) {
        this.stars = stars;
        return this;
    }

    /**
    * Open GitHub issues on our main repo
    * @return issues
    **/
    @JsonProperty("issues")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getIssues() {
        return issues;
    }

    /**
     * Set issues
     **/
    public void setIssues(Integer issues) {
        this.issues = issues;
    }

    public Metrics issues(Integer issues) {
        this.issues = issues;
        return this;
    }

    /**
    * Get thisWeek
    * @return thisWeek
    **/
    @JsonProperty("thisWeek")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public MetricsThisWeek getThisWeek() {
        return thisWeek;
    }

    /**
     * Set thisWeek
     **/
    public void setThisWeek(MetricsThisWeek thisWeek) {
        this.thisWeek = thisWeek;
    }

    public Metrics thisWeek(MetricsThisWeek thisWeek) {
        this.thisWeek = thisWeek;
        return this;
    }

    /**
    * Number of methods of API retrieval
    * @return numDrivers
    **/
    @JsonProperty("numDrivers")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getNumDrivers() {
        return numDrivers;
    }

    /**
     * Set numDrivers
     **/
    public void setNumDrivers(Integer numDrivers) {
        this.numDrivers = numDrivers;
    }

    public Metrics numDrivers(Integer numDrivers) {
        this.numDrivers = numDrivers;
        return this;
    }

    /**
    * Number of API providers in directory
    * @return numProviders
    **/
    @JsonProperty("numProviders")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getNumProviders() {
        return numProviders;
    }

    /**
     * Set numProviders
     **/
    public void setNumProviders(Integer numProviders) {
        this.numProviders = numProviders;
    }

    public Metrics numProviders(Integer numProviders) {
        this.numProviders = numProviders;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metrics {\n");

        sb.append("    numSpecs: ").append(toIndentedString(numSpecs)).append("\n");
        sb.append("    numAPIs: ").append(toIndentedString(numAPIs)).append("\n");
        sb.append("    numEndpoints: ").append(toIndentedString(numEndpoints)).append("\n");
        sb.append("    unreachable: ").append(toIndentedString(unreachable)).append("\n");
        sb.append("    invalid: ").append(toIndentedString(invalid)).append("\n");
        sb.append("    unofficial: ").append(toIndentedString(unofficial)).append("\n");
        sb.append("    fixes: ").append(toIndentedString(fixes)).append("\n");
        sb.append("    fixedPct: ").append(toIndentedString(fixedPct)).append("\n");
        sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
        sb.append("    stars: ").append(toIndentedString(stars)).append("\n");
        sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
        sb.append("    thisWeek: ").append(toIndentedString(thisWeek)).append("\n");
        sb.append("    numDrivers: ").append(toIndentedString(numDrivers)).append("\n");
        sb.append("    numProviders: ").append(toIndentedString(numProviders)).append("\n");
        
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
      * List of basic metrics
     **/
    public static class MetricsQueryParam  {

        /**
          * List of basic metrics
         **/
        @jakarta.ws.rs.QueryParam("numSpecs")
        private Integer numSpecs;
        /**
          * List of basic metrics
         **/
        @jakarta.ws.rs.QueryParam("numAPIs")
        private Integer numAPIs;
        /**
          * List of basic metrics
         **/
        @jakarta.ws.rs.QueryParam("numEndpoints")
        private Integer numEndpoints;
        /**
          * List of basic metrics
         **/
        @jakarta.ws.rs.QueryParam("unreachable")
        private Integer unreachable;
        /**
          * List of basic metrics
         **/
        @jakarta.ws.rs.QueryParam("invalid")
        private Integer invalid;
        /**
          * List of basic metrics
         **/
        @jakarta.ws.rs.QueryParam("unofficial")
        private Integer unofficial;
        /**
          * List of basic metrics
         **/
        @jakarta.ws.rs.QueryParam("fixes")
        private Integer fixes;
        /**
          * List of basic metrics
         **/
        @jakarta.ws.rs.QueryParam("fixedPct")
        private Integer fixedPct;
        /**
          * List of basic metrics
         **/
        @jakarta.ws.rs.QueryParam("datasets")
        private List<Object> datasets = null;
        /**
          * List of basic metrics
         **/
        @jakarta.ws.rs.QueryParam("stars")
        private Integer stars;
        /**
          * List of basic metrics
         **/
        @jakarta.ws.rs.QueryParam("issues")
        private Integer issues;
        /**
          * List of basic metrics
         **/
        @jakarta.ws.rs.QueryParam("thisWeek")
        private MetricsThisWeek thisWeek;
        /**
          * List of basic metrics
         **/
        @jakarta.ws.rs.QueryParam("numDrivers")
        private Integer numDrivers;
        /**
          * List of basic metrics
         **/
        @jakarta.ws.rs.QueryParam("numProviders")
        private Integer numProviders;

        /**
        * Number of API definitions including different versions of the same API
        * minimum: 1
        * @return numSpecs
        **/
        @JsonProperty("numSpecs")
        public Integer getNumSpecs() {
            return numSpecs;
        }

        /**
         * Set numSpecs
         **/
        public void setNumSpecs(Integer numSpecs) {
            this.numSpecs = numSpecs;
        }

        public MetricsQueryParam numSpecs(Integer numSpecs) {
            this.numSpecs = numSpecs;
            return this;
        }

        /**
        * Number of unique APIs
        * minimum: 1
        * @return numAPIs
        **/
        @JsonProperty("numAPIs")
        public Integer getNumAPIs() {
            return numAPIs;
        }

        /**
         * Set numAPIs
         **/
        public void setNumAPIs(Integer numAPIs) {
            this.numAPIs = numAPIs;
        }

        public MetricsQueryParam numAPIs(Integer numAPIs) {
            this.numAPIs = numAPIs;
            return this;
        }

        /**
        * Total number of endpoints inside all definitions
        * minimum: 1
        * @return numEndpoints
        **/
        @JsonProperty("numEndpoints")
        public Integer getNumEndpoints() {
            return numEndpoints;
        }

        /**
         * Set numEndpoints
         **/
        public void setNumEndpoints(Integer numEndpoints) {
            this.numEndpoints = numEndpoints;
        }

        public MetricsQueryParam numEndpoints(Integer numEndpoints) {
            this.numEndpoints = numEndpoints;
            return this;
        }

        /**
        * Number of unreachable (4XX,5XX status) APIs
        * @return unreachable
        **/
        @JsonProperty("unreachable")
        public Integer getUnreachable() {
            return unreachable;
        }

        /**
         * Set unreachable
         **/
        public void setUnreachable(Integer unreachable) {
            this.unreachable = unreachable;
        }

        public MetricsQueryParam unreachable(Integer unreachable) {
            this.unreachable = unreachable;
            return this;
        }

        /**
        * Number of newly invalid APIs
        * @return invalid
        **/
        @JsonProperty("invalid")
        public Integer getInvalid() {
            return invalid;
        }

        /**
         * Set invalid
         **/
        public void setInvalid(Integer invalid) {
            this.invalid = invalid;
        }

        public MetricsQueryParam invalid(Integer invalid) {
            this.invalid = invalid;
            return this;
        }

        /**
        * Number of unofficial APIs
        * @return unofficial
        **/
        @JsonProperty("unofficial")
        public Integer getUnofficial() {
            return unofficial;
        }

        /**
         * Set unofficial
         **/
        public void setUnofficial(Integer unofficial) {
            this.unofficial = unofficial;
        }

        public MetricsQueryParam unofficial(Integer unofficial) {
            this.unofficial = unofficial;
            return this;
        }

        /**
        * Total number of fixes applied across all APIs
        * @return fixes
        **/
        @JsonProperty("fixes")
        public Integer getFixes() {
            return fixes;
        }

        /**
         * Set fixes
         **/
        public void setFixes(Integer fixes) {
            this.fixes = fixes;
        }

        public MetricsQueryParam fixes(Integer fixes) {
            this.fixes = fixes;
            return this;
        }

        /**
        * Percentage of all APIs where auto fixes have been applied
        * @return fixedPct
        **/
        @JsonProperty("fixedPct")
        public Integer getFixedPct() {
            return fixedPct;
        }

        /**
         * Set fixedPct
         **/
        public void setFixedPct(Integer fixedPct) {
            this.fixedPct = fixedPct;
        }

        public MetricsQueryParam fixedPct(Integer fixedPct) {
            this.fixedPct = fixedPct;
            return this;
        }

        /**
        * Data used for charting etc
        * @return datasets
        **/
        @JsonProperty("datasets")
        public List<Object> getDatasets() {
            return datasets;
        }

        /**
         * Set datasets
         **/
        public void setDatasets(List<Object> datasets) {
            this.datasets = datasets;
        }

        public MetricsQueryParam datasets(List<Object> datasets) {
            this.datasets = datasets;
            return this;
        }
        public MetricsQueryParam addDatasetsItem(Object datasetsItem) {
            this.datasets.add(datasetsItem);
            return this;
        }

        /**
        * GitHub stars for our main repo
        * @return stars
        **/
        @JsonProperty("stars")
        public Integer getStars() {
            return stars;
        }

        /**
         * Set stars
         **/
        public void setStars(Integer stars) {
            this.stars = stars;
        }

        public MetricsQueryParam stars(Integer stars) {
            this.stars = stars;
            return this;
        }

        /**
        * Open GitHub issues on our main repo
        * @return issues
        **/
        @JsonProperty("issues")
        public Integer getIssues() {
            return issues;
        }

        /**
         * Set issues
         **/
        public void setIssues(Integer issues) {
            this.issues = issues;
        }

        public MetricsQueryParam issues(Integer issues) {
            this.issues = issues;
            return this;
        }

        /**
        * Get thisWeek
        * @return thisWeek
        **/
        @JsonProperty("thisWeek")
        public MetricsThisWeek getThisWeek() {
            return thisWeek;
        }

        /**
         * Set thisWeek
         **/
        public void setThisWeek(MetricsThisWeek thisWeek) {
            this.thisWeek = thisWeek;
        }

        public MetricsQueryParam thisWeek(MetricsThisWeek thisWeek) {
            this.thisWeek = thisWeek;
            return this;
        }

        /**
        * Number of methods of API retrieval
        * @return numDrivers
        **/
        @JsonProperty("numDrivers")
        public Integer getNumDrivers() {
            return numDrivers;
        }

        /**
         * Set numDrivers
         **/
        public void setNumDrivers(Integer numDrivers) {
            this.numDrivers = numDrivers;
        }

        public MetricsQueryParam numDrivers(Integer numDrivers) {
            this.numDrivers = numDrivers;
            return this;
        }

        /**
        * Number of API providers in directory
        * @return numProviders
        **/
        @JsonProperty("numProviders")
        public Integer getNumProviders() {
            return numProviders;
        }

        /**
         * Set numProviders
         **/
        public void setNumProviders(Integer numProviders) {
            this.numProviders = numProviders;
        }

        public MetricsQueryParam numProviders(Integer numProviders) {
            this.numProviders = numProviders;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MetricsQueryParam {\n");

            sb.append("    numSpecs: ").append(toIndentedString(numSpecs)).append("\n");
            sb.append("    numAPIs: ").append(toIndentedString(numAPIs)).append("\n");
            sb.append("    numEndpoints: ").append(toIndentedString(numEndpoints)).append("\n");
            sb.append("    unreachable: ").append(toIndentedString(unreachable)).append("\n");
            sb.append("    invalid: ").append(toIndentedString(invalid)).append("\n");
            sb.append("    unofficial: ").append(toIndentedString(unofficial)).append("\n");
            sb.append("    fixes: ").append(toIndentedString(fixes)).append("\n");
            sb.append("    fixedPct: ").append(toIndentedString(fixedPct)).append("\n");
            sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
            sb.append("    stars: ").append(toIndentedString(stars)).append("\n");
            sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
            sb.append("    thisWeek: ").append(toIndentedString(thisWeek)).append("\n");
            sb.append("    numDrivers: ").append(toIndentedString(numDrivers)).append("\n");
            sb.append("    numProviders: ").append(toIndentedString(numProviders)).append("\n");
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