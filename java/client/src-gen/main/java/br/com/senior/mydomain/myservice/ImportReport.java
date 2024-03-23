package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.Valid;


public class ImportReport {
    
    @NotNull(message = "id is required")
    public String id;
    
    @NotNull(message = "startTime is required")
    public java.time.Instant startTime;
    
    @NotNull(message = "endTime is required")
    public java.time.Instant endTime;
    
    @NotNull(message = "uri is required")
    public String uri;
    
    @NotNull(message = "beanClass is required")
    public String beanClass;
    
    @NotNull(message = "serviceClass is required")
    public String serviceClass;
    
    @NotNull(message = "layout is required")
    @Valid
    public Layoutdto layout;
    
    @NotNull(message = "sucessCount is required")
    public Long sucessCount;
    
    @NotNull(message = "errorsCount is required")
    public Long errorsCount;
    
    @NotNull(message = "filteredCount is required")
    public Long filteredCount;
    
    @NotNull(message = "skippedCount is required")
    public Long skippedCount;
    
    @Valid
    public java.util.List<ImportError> importErrors;
    
    
    public ImportReport() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public ImportReport(String id, java.time.Instant startTime, java.time.Instant endTime, String uri, String beanClass, String serviceClass, Layoutdto layout, Long sucessCount, Long errorsCount, Long filteredCount, Long skippedCount, java.util.List<ImportError> importErrors) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.uri = uri;
        this.beanClass = beanClass;
        this.serviceClass = serviceClass;
        this.layout = layout;
        this.sucessCount = sucessCount;
        this.errorsCount = errorsCount;
        this.filteredCount = filteredCount;
        this.skippedCount = skippedCount;
        this.importErrors = importErrors;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public ImportReport(String id, java.time.Instant startTime, java.time.Instant endTime, String uri, String beanClass, String serviceClass, Layoutdto layout, Long sucessCount, Long errorsCount, Long filteredCount, Long skippedCount) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.uri = uri;
        this.beanClass = beanClass;
        this.serviceClass = serviceClass;
        this.layout = layout;
        this.sucessCount = sucessCount;
        this.errorsCount = errorsCount;
        this.filteredCount = filteredCount;
        this.skippedCount = skippedCount;
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
        if (startTime != null) {
            ret = 31 * ret + startTime.hashCode();
        }
        if (endTime != null) {
            ret = 31 * ret + endTime.hashCode();
        }
        if (uri != null) {
            ret = 31 * ret + uri.hashCode();
        }
        if (beanClass != null) {
            ret = 31 * ret + beanClass.hashCode();
        }
        if (serviceClass != null) {
            ret = 31 * ret + serviceClass.hashCode();
        }
        if (layout != null) {
            ret = 31 * ret + layout.hashCode();
        }
        if (sucessCount != null) {
            ret = 31 * ret + sucessCount.hashCode();
        }
        if (errorsCount != null) {
            ret = 31 * ret + errorsCount.hashCode();
        }
        if (filteredCount != null) {
            ret = 31 * ret + filteredCount.hashCode();
        }
        if (skippedCount != null) {
            ret = 31 * ret + skippedCount.hashCode();
        }
        if (importErrors != null) {
            ret = 31 * ret + importErrors.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImportReport)) {
            return false;
        }
        ImportReport other = (ImportReport) obj;
        if ((id == null) != (other.id == null)) {
            return false;
        }
        if ((id != null) && !id.equals(other.id)) {
            return false;
        }
        if ((startTime == null) != (other.startTime == null)) {
            return false;
        }
        if ((startTime != null) && !startTime.equals(other.startTime)) {
            return false;
        }
        if ((endTime == null) != (other.endTime == null)) {
            return false;
        }
        if ((endTime != null) && !endTime.equals(other.endTime)) {
            return false;
        }
        if ((uri == null) != (other.uri == null)) {
            return false;
        }
        if ((uri != null) && !uri.equals(other.uri)) {
            return false;
        }
        if ((beanClass == null) != (other.beanClass == null)) {
            return false;
        }
        if ((beanClass != null) && !beanClass.equals(other.beanClass)) {
            return false;
        }
        if ((serviceClass == null) != (other.serviceClass == null)) {
            return false;
        }
        if ((serviceClass != null) && !serviceClass.equals(other.serviceClass)) {
            return false;
        }
        if ((layout == null) != (other.layout == null)) {
            return false;
        }
        if ((layout != null) && !layout.equals(other.layout)) {
            return false;
        }
        if ((sucessCount == null) != (other.sucessCount == null)) {
            return false;
        }
        if ((sucessCount != null) && !sucessCount.equals(other.sucessCount)) {
            return false;
        }
        if ((errorsCount == null) != (other.errorsCount == null)) {
            return false;
        }
        if ((errorsCount != null) && !errorsCount.equals(other.errorsCount)) {
            return false;
        }
        if ((filteredCount == null) != (other.filteredCount == null)) {
            return false;
        }
        if ((filteredCount != null) && !filteredCount.equals(other.filteredCount)) {
            return false;
        }
        if ((skippedCount == null) != (other.skippedCount == null)) {
            return false;
        }
        if ((skippedCount != null) && !skippedCount.equals(other.skippedCount)) {
            return false;
        }
        if ((importErrors == null) != (other.importErrors == null)) {
            return false;
        }
        if ((importErrors != null) && !importErrors.equals(other.importErrors)) {
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
    	ImportReportStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
