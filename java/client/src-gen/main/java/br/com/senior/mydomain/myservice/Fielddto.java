package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class Fielddto {
    
    @NotNull(message = "id is required")
    public Long id;
    
    @NotNull(message = "name is required")
    public String name;
    
    @NotNull(message = "fieldType is required")
    public FieldType fieldType;
    
    public Long start;
    
    public Long size;
    
    public String maskPattern;
    
    
    public Fielddto() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public Fielddto(Long id, String name, FieldType fieldType, Long start, Long size, String maskPattern) {
        this.id = id;
        this.name = name;
        this.fieldType = fieldType;
        this.start = start;
        this.size = size;
        this.maskPattern = maskPattern;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public Fielddto(Long id, String name, FieldType fieldType) {
        this.id = id;
        this.name = name;
        this.fieldType = fieldType;
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
        if (id != null) {
            ret = 31 * ret + id.hashCode();
        }
        if (name != null) {
            ret = 31 * ret + name.hashCode();
        }
        if (fieldType != null) {
            ret = 31 * ret + fieldType.hashCode();
        }
        if (start != null) {
            ret = 31 * ret + start.hashCode();
        }
        if (size != null) {
            ret = 31 * ret + size.hashCode();
        }
        if (maskPattern != null) {
            ret = 31 * ret + maskPattern.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fielddto)) {
            return false;
        }
        Fielddto other = (Fielddto) obj;
        if ((id == null) != (other.id == null)) {
            return false;
        }
        if ((id != null) && !id.equals(other.id)) {
            return false;
        }
        if ((name == null) != (other.name == null)) {
            return false;
        }
        if ((name != null) && !name.equals(other.name)) {
            return false;
        }
        if ((fieldType == null) != (other.fieldType == null)) {
            return false;
        }
        if ((fieldType != null) && !fieldType.equals(other.fieldType)) {
            return false;
        }
        if ((start == null) != (other.start == null)) {
            return false;
        }
        if ((start != null) && !start.equals(other.start)) {
            return false;
        }
        if ((size == null) != (other.size == null)) {
            return false;
        }
        if ((size != null) && !size.equals(other.size)) {
            return false;
        }
        if ((maskPattern == null) != (other.maskPattern == null)) {
            return false;
        }
        if ((maskPattern != null) && !maskPattern.equals(other.maskPattern)) {
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
    	FielddtoStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
