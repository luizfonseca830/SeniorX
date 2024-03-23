package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.senior.messaging.model.EntityDescription;
import br.com.senior.messaging.model.EntityId;
import br.com.senior.custom.CustomDTO;

/**
 * Entidade que representa o evento
 */
@EntityDescription
public class Evento extends CustomDTO {
    
    public static class Id {
    	
        public String id;
        
        public Id() {
        }
        
        public Id(String eventoId) {
            this.id = eventoId;
        }
        
        public String getEventoId() {
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
    	
        public List<Evento> contents;
        
        public PagedResults() {
        }
        
        public PagedResults(List<Evento> contents) {
            this.contents = contents;
        }
        
        public PagedResults(List<Evento> contents, Long totalPages, Long totalElements) {
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
     * ID do evento
     */
    public String id;
    
    /**
     * Nome do evento
     */
    @NotNull(message = "nome is required")
    @Size(max = 30, message = "nome max length is {max}")
    public String nome;
    
    /**
     * Data e hora do evento
     */
    @NotNull(message = "dataHora is required")
    public java.time.Instant dataHora;
    
    /**
     * Enderenço do evento
     */
    @NotNull(message = "endereco is required")
    @Size(max = 50, message = "endereco max length is {max}")
    public String endereco;
    
    /**
     * Tipos de entrada permitidos no evento
     */
    public java.util.List<TipoEntrada> tipoEntradaEvento;
    
    
	private List<JsonPatch> jsonPatches;
	
    public Evento() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public Evento(String id, String nome, java.time.Instant dataHora, String endereco, java.util.List<TipoEntrada> tipoEntradaEvento, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.nome = nome;
        this.dataHora = dataHora;
        this.endereco = endereco;
        this.tipoEntradaEvento = tipoEntradaEvento;
        this.jsonPatches = jsonPatches;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public Evento(String nome, java.time.Instant dataHora, String endereco) {
        this.nome = nome;
        this.dataHora = dataHora;
        this.endereco = endereco;
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
        if (!(obj instanceof Evento)) {
            return false;
        }
        Evento other = (Evento) obj;
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
    	EventoStringSerializer.INSTANCE.serialize(this, sb, appended);
    }
    
	
    public List<JsonPatch> getJsonPatches(){
    	return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}
