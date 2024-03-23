package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.Valid;


public class ImportConfig {
    
    @NotNull(message = "uri is required")
    public String uri;
    
    @NotNull(message = "layout is required")
    @Valid
    public Layoutdto layout;
    
    @NotNull(message = "async is required")
    public Boolean async;
    
    @NotNull(message = "batchSize is required")
    public Long batchSize;
    
    @NotNull(message = "errorStrategy is required")
    public ErrorStrategy errorStrategy;
    
    
    public ImportConfig() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public ImportConfig(String uri, Layoutdto layout, Boolean async, Long batchSize, ErrorStrategy errorStrategy) {
        this.uri = uri;
        this.layout = layout;
        this.async = async;
        this.batchSize = batchSize;
        this.errorStrategy = errorStrategy;
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
        if (uri != null) {
            ret = 31 * ret + uri.hashCode();
        }
        if (layout != null) {
            ret = 31 * ret + layout.hashCode();
        }
        if (async != null) {
            ret = 31 * ret + async.hashCode();
        }
        if (batchSize != null) {
            ret = 31 * ret + batchSize.hashCode();
        }
        if (errorStrategy != null) {
            ret = 31 * ret + errorStrategy.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImportConfig)) {
            return false;
        }
        ImportConfig other = (ImportConfig) obj;
        if ((uri == null) != (other.uri == null)) {
            return false;
        }
        if ((uri != null) && !uri.equals(other.uri)) {
            return false;
        }
        if ((layout == null) != (other.layout == null)) {
            return false;
        }
        if ((layout != null) && !layout.equals(other.layout)) {
            return false;
        }
        if ((async == null) != (other.async == null)) {
            return false;
        }
        if ((async != null) && !async.equals(other.async)) {
            return false;
        }
        if ((batchSize == null) != (other.batchSize == null)) {
            return false;
        }
        if ((batchSize != null) && !batchSize.equals(other.batchSize)) {
            return false;
        }
        if ((errorStrategy == null) != (other.errorStrategy == null)) {
            return false;
        }
        if ((errorStrategy != null) && !errorStrategy.equals(other.errorStrategy)) {
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
    	ImportConfigStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
