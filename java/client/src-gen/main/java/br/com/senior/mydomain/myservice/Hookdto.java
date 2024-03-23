package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class Hookdto {
    
    @NotNull(message = "hookFunction is required")
    public HookFunction hookFunction;
    
    @NotNull(message = "script is required")
    public String script;
    
    
    public Hookdto() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public Hookdto(HookFunction hookFunction, String script) {
        this.hookFunction = hookFunction;
        this.script = script;
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
        if (hookFunction != null) {
            ret = 31 * ret + hookFunction.hashCode();
        }
        if (script != null) {
            ret = 31 * ret + script.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Hookdto)) {
            return false;
        }
        Hookdto other = (Hookdto) obj;
        if ((hookFunction == null) != (other.hookFunction == null)) {
            return false;
        }
        if ((hookFunction != null) && !hookFunction.equals(other.hookFunction)) {
            return false;
        }
        if ((script == null) != (other.script == null)) {
            return false;
        }
        if ((script != null) && !script.equals(other.script)) {
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
    	HookdtoStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
