
package com.paypal.bfs.test.employeeserv.api.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lane1",
    "lane2",
    "city",
    "state",
    "country ",
    "zip_code"
})
public class Address {

    /**
     * lane1
     * (Required)
     * 
     */
    @JsonProperty("lane1")
    @JsonPropertyDescription("lane1")
    private String lane1;
    /**
     * lane2
     * 
     */
    @JsonProperty("lane2")
    @JsonPropertyDescription("lane2")
    private String lane2;
    /**
     * city
     * (Required)
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("city")
    private String city;
    /**
     * state
     * (Required)
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("state")
    private String state;
    /**
     * country
     * (Required)
     * 
     */
    @JsonProperty("country ")
    @JsonPropertyDescription("country")
    private String country;
    /**
     * zip_code
     * (Required)
     * 
     */
    @JsonProperty("zip_code")
    @JsonPropertyDescription("zip_code")
    private Integer zipCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * lane1
     * (Required)
     * 
     */
    @JsonProperty("lane1")
    public String getLane1() {
        return lane1;
    }

    /**
     * lane1
     * (Required)
     * 
     */
    @JsonProperty("lane1")
    public void setLane1(String lane1) {
        this.lane1 = lane1;
    }

    /**
     * lane2
     * 
     */
    @JsonProperty("lane2")
    public String getLane2() {
        return lane2;
    }

    /**
     * lane2
     * 
     */
    @JsonProperty("lane2")
    public void setLane2(String lane2) {
        this.lane2 = lane2;
    }

    /**
     * city
     * (Required)
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * city
     * (Required)
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * state
     * (Required)
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * state
     * (Required)
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * country
     * (Required)
     * 
     */
    @JsonProperty("country ")
    public String getCountry() {
        return country;
    }

    /**
     * country
     * (Required)
     * 
     */
    @JsonProperty("country ")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * zip_code
     * (Required)
     * 
     */
    @JsonProperty("zip_code")
    public Integer getZipCode() {
        return zipCode;
    }

    /**
     * zip_code
     * (Required)
     * 
     */
    @JsonProperty("zip_code")
    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lane1");
        sb.append('=');
        sb.append(((this.lane1 == null)?"<null>":this.lane1));
        sb.append(',');
        sb.append("lane2");
        sb.append('=');
        sb.append(((this.lane2 == null)?"<null>":this.lane2));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("zipCode");
        sb.append('=');
        sb.append(((this.zipCode == null)?"<null>":this.zipCode));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
