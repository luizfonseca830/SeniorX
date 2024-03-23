package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.Valid;


public class Layoutdto {
    
    @NotNull(message = "id is required")
    public Long id;
    
    @NotNull(message = "description is required")
    public String description;
    
    @NotNull(message = "fileFormat is required")
    public FileFormat fileFormat;
    
    @NotNull(message = "errorStrategy is required")
    public ErrorStrategy errorStrategy;
    
    public String delimiter;
    
    @NotNull(message = "skipLines is required")
    public Long skipLines;
    
    @NotEmpty(message = "fields is required, at least one value must be present")
    @Valid
    public java.util.List<Fielddto> fields;
    
    @Valid
    public java.util.List<Hookdto> hooks;
    
    
    public Layoutdto() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public Layoutdto(Long id, String description, FileFormat fileFormat, ErrorStrategy errorStrategy, String delimiter, Long skipLines, java.util.List<Fielddto> fields, java.util.List<Hookdto> hooks) {
        this.id = id;
        this.description = description;
        this.fileFormat = fileFormat;
        this.errorStrategy = errorStrategy;
        this.delimiter = delimiter;
        this.skipLines = skipLines;
        this.fields = fields;
        this.hooks = hooks;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public Layoutdto(Long id, String description, FileFormat fileFormat, ErrorStrategy errorStrategy, Long skipLines, java.util.List<Fielddto> fields) {
        this.id = id;
        this.description = description;
        this.fileFormat = fileFormat;
        this.errorStrategy = errorStrategy;
        this.skipLines = skipLines;
        this.fields = fields;
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
        if (description != null) {
            ret = 31 * ret + description.hashCode();
        }
        if (fileFormat != null) {
            ret = 31 * ret + fileFormat.hashCode();
        }
        if (errorStrategy != null) {
            ret = 31 * ret + errorStrategy.hashCode();
        }
        if (delimiter != null) {
            ret = 31 * ret + delimiter.hashCode();
        }
        if (skipLines != null) {
            ret = 31 * ret + skipLines.hashCode();
        }
        if (fields != null) {
            ret = 31 * ret + fields.hashCode();
        }
        if (hooks != null) {
            ret = 31 * ret + hooks.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Layoutdto)) {
            return false;
        }
        Layoutdto other = (Layoutdto) obj;
        if ((id == null) != (other.id == null)) {
            return false;
        }
        if ((id != null) && !id.equals(other.id)) {
            return false;
        }
        if ((description == null) != (other.description == null)) {
            return false;
        }
        if ((description != null) && !description.equals(other.description)) {
            return false;
        }
        if ((fileFormat == null) != (other.fileFormat == null)) {
            return false;
        }
        if ((fileFormat != null) && !fileFormat.equals(other.fileFormat)) {
            return false;
        }
        if ((errorStrategy == null) != (other.errorStrategy == null)) {
            return false;
        }
        if ((errorStrategy != null) && !errorStrategy.equals(other.errorStrategy)) {
            return false;
        }
        if ((delimiter == null) != (other.delimiter == null)) {
            return false;
        }
        if ((delimiter != null) && !delimiter.equals(other.delimiter)) {
            return false;
        }
        if ((skipLines == null) != (other.skipLines == null)) {
            return false;
        }
        if ((skipLines != null) && !skipLines.equals(other.skipLines)) {
            return false;
        }
        if ((fields == null) != (other.fields == null)) {
            return false;
        }
        if ((fields != null) && !fields.equals(other.fields)) {
            return false;
        }
        if ((hooks == null) != (other.hooks == null)) {
            return false;
        }
        if ((hooks != null) && !hooks.equals(other.hooks)) {
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
    	LayoutdtoStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
