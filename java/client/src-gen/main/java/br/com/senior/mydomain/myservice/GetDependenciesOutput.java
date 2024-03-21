package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotEmpty;
import javax.validation.Valid;


public class GetDependenciesOutput {
    
    /**
     * List with this service dependencies
     */
    @NotEmpty(message = "dependencies is required, at least one value must be present")
    @Valid
    public java.util.List<Dependency> dependencies;
    
    
    public GetDependenciesOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public GetDependenciesOutput(java.util.List<Dependency> dependencies) {
        this.dependencies = dependencies;
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
        if (dependencies != null) {
            ret = 31 * ret + dependencies.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetDependenciesOutput)) {
            return false;
        }
        GetDependenciesOutput other = (GetDependenciesOutput) obj;
        if ((dependencies == null) != (other.dependencies == null)) {
            return false;
        }
        if ((dependencies != null) && !dependencies.equals(other.dependencies)) {
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
    	GetDependenciesOutputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
