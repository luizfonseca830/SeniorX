package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;


public class HelloWorldImplOutput {
    
    /**
     * Saida com a mensagem de olá mundo
     */
    @NotNull(message = "helloWorldMessage is required")
    public String helloWorldMessage;
    
    
    public HelloWorldImplOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public HelloWorldImplOutput(String helloWorldMessage) {
        this.helloWorldMessage = helloWorldMessage;
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
        if (helloWorldMessage != null) {
            ret = 31 * ret + helloWorldMessage.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelloWorldImplOutput)) {
            return false;
        }
        HelloWorldImplOutput other = (HelloWorldImplOutput) obj;
        if ((helloWorldMessage == null) != (other.helloWorldMessage == null)) {
            return false;
        }
        if ((helloWorldMessage != null) && !helloWorldMessage.equals(other.helloWorldMessage)) {
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
    	HelloWorldImplOutputStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
}
