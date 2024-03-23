package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Max;

import br.com.senior.messaging.model.EntityDescription;
import br.com.senior.messaging.model.EntityId;
import br.com.senior.custom.CustomDTO;

/**
 * Entidade que representa o ingresso
 */
@EntityDescription
public class Ingresso extends CustomDTO {
    
    public static class Id {
    	
        public String id;
        
        public Id() {
        }
        
        public Id(String ingressoId) {
            this.id = ingressoId;
        }
        
        public String getIngressoId() {
            return id;
        }
        
        public String getId() {
            return id;
        }
        
    	public void normalize(Map<String, Object> headers) {
    		MyServiceNormalizer.normalize(this, headers);
    	}
    	
    }
    
    public static class PagedResults {
    	public Long totalPages;
    	public Long totalElements;
    	
        public List<Ingresso> contents;
        
        public PagedResults() {
        }
        
        public PagedResults(List<Ingresso> contents) {
            this.contents = contents;
        }
        
        public PagedResults(List<Ingresso> contents, Long totalPages, Long totalElements) {
            this.contents = contents;
            this.totalPages = totalPages;
            this.totalElements = totalElements;
        }
    }
    
    public static class PageRequest {
        public Long offset;
        public Long size;
        public boolean translations;
        public String orderBy;
        public String filter;
        public List<String> displayFields;
        
        public PageRequest() {
        }
        
        public PageRequest(Long offset, Long size) {
            this(offset, size, null, null);
        }
        
        public PageRequest(Long offset, Long size, String orderBy) {
            this(offset, size, orderBy, null);
        }
        
        public PageRequest(Long offset, Long size, String orderBy, String filter) {
            this(offset, size, orderBy, filter, null);
       	}
        
        public PageRequest(Long offset, Long size, String orderBy, String filter, List<String> displayFields) {
            this.offset = offset;
        	this.size = size;
        	this.orderBy = orderBy;
        	this.filter = filter;
        	this.displayFields = displayFields;
        }
    }
    			    
    public static class GetRequest {
        public String id;
        public List<String> displayFields;
        public boolean translations;
        
        public GetRequest() {
        }
        
        public GetRequest(String id) {
            this(id, null);
        }
        
        public GetRequest(String id, List<String> displayFields) {
            this.id = id;
            this.displayFields = displayFields;
        }
    }

    @EntityId
    /**
     * ID do ingresso
     */
    public String id;
    
    /**
     * Data e hora do evento. Opcional, pois a data e hora estão no evento
     */
    public java.time.Instant dataHora;
    
    /**
     * Convidado dono do ingresso
     */
    @ValidEntity(message = "convidado.id is required")
    public Convidado convidado;
    
    /**
     * Quantidade de acompanhantes do ingresso
     */
    @NotNull(message = "quantidadeAcompanhantes is required")
    @Min(value = 0L, message = "quantidadeAcompanhantes min value is {value}")
    @Max(value = 9L, message = "quantidadeAcompanhantes max value is {value}")
    public Long quantidadeAcompanhantes;
    
    /**
     * Evento que o ingresso pertence
     */
    @ValidEntity(message = "evento.id is required")
    public Evento evento;
    
    
	private List<JsonPatch> jsonPatches;
	
    public Ingresso() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public Ingresso(String id, java.time.Instant dataHora, Convidado convidado, Long quantidadeAcompanhantes, Evento evento, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.dataHora = dataHora;
        this.convidado = convidado;
        this.quantidadeAcompanhantes = quantidadeAcompanhantes;
        this.evento = evento;
        this.jsonPatches = jsonPatches;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public Ingresso(Long quantidadeAcompanhantes) {
        this.quantidadeAcompanhantes = quantidadeAcompanhantes;
    }
    
    public void normalize(Map<String, Object> headers) {
    	MyServiceNormalizer.normalize(this, headers);
    }
    
    public void validate() {
    	validate(true);
    }
    
    public void validate(boolean required) {
    	validate(null, true);
    }
    
    public void validate(Map<String, Object> headers, boolean required) {
    	validate(headers, required, new ArrayList<>());
    }
    
    void validate(Map<String, Object> headers, boolean required, List<Object> validated) {
    	MyServiceValidator.validate(this, headers, required, validated);
    }
    @Override
    public int hashCode() {
        int ret = 1;
        if (id != null) {
            ret = 31 * ret + id.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ingresso)) {
            return false;
        }
        Ingresso other = (Ingresso) obj;
        if (id == null || !id.equals(other.id)) {
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
    	IngressoStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
	
    public List<JsonPatch> getJsonPatches(){
    	return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}
