package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public class GetMetadataInput {
    
    public String metadataFormat;
    
    
    public GetMetadataInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public GetMetadataInput(String metadataFormat) {
        this.metadataFormat = metadataFormat;
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
        if (metadataFormat != null) {
            ret = 31 * ret + metadataFormat.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetMetadataInput)) {
            return false;
        }
        GetMetadataInput other = (GetMetadataInput) obj;
        if ((metadataFormat == null) != (other.metadataFormat == null)) {
            return false;
        }
        if ((metadataFormat != null) && !metadataFormat.equals(other.metadataFormat)) {
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
    	GetMetadataInputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
