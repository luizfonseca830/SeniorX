package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


/**
 * Represents a service dependency
 */
public class Dependency {
    
    /**
     * Domain of the dependency service
     */
    @NotNull(message = "domain is required")
    public String domain;
    
    /**
     * Name of the dependency service
     */
    @NotNull(message = "service is required")
    public String service;
    
    /**
     * Version of the dependency service
     */
    @NotNull(message = "version is required")
    public String version;
    
    
    public Dependency() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public Dependency(String domain, String service, String version) {
        this.domain = domain;
        this.service = service;
        this.version = version;
    }
    
    public void validate() {
        validate(true);
    }
    
    public void validate(boolean required) {
        validate(null, required);
    }
    
    public void validate(Map<String, Object> headers, boolean required) {
    	validate(headers, required, new ArrayList<>());
    }
    
    public void validate(Map<String, Object> headers, boolean required, List<Object> validated) {
    	MyServiceValidator.validate(this, headers, required, validated);
    }
    @Override
    public int hashCode() {
        int ret = 1;
        if (domain != null) {
            ret = 31 * ret + domain.hashCode();
        }
        if (service != null) {
            ret = 31 * ret + service.hashCode();
        }
        if (version != null) {
            ret = 31 * ret + version.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dependency)) {
            return false;
        }
        Dependency other = (Dependency) obj;
        if ((domain == null) != (other.domain == null)) {
            return false;
        }
        if ((domain != null) && !domain.equals(other.domain)) {
            return false;
        }
        if ((service == null) != (other.service == null)) {
            return false;
        }
        if ((service != null) && !service.equals(other.service)) {
            return false;
        }
        if ((version == null) != (other.version == null)) {
            return false;
        }
        if ((version != null) && !version.equals(other.version)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	toString(sb, new ArrayList<>());
    	return sb.toString();
    }
    
    public void toString(StringBuilder sb, List<Object> appended) {
    	DependencyStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
