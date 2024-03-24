/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;

import br.com.senior.custom.CustomEntity;
import br.com.senior.custom.odata.entity.ODataEntity;

import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Transient;
import org.springframework.data.domain.Persistable;

@Entity(name="my_domain.my_service.AtracaoEntity")
@ODataEntity(id = "atracao")
@Table(name="atracao")
public class AtracaoEntity extends CustomEntity implements Persistable<java.util.UUID> {
	
	public static final String SECURITY_RESOURCE = "res://senior.com.br/my_domain/my_service/entities/atracao";

	/**
	 * ID da atracao
	 */
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", updatable = false)
	private java.util.UUID id;
	
	/**
	 * nome da atracao
	 */
	@Column(name = "nome")
	private String nome;
	
	/**
	 * data e hora da atracao
	 */
	@Column(name = "data_hora")
	private java.time.Instant dataHora;
	
	/**
	 * local da atracao
	 */
	@Column(name = "local", length = 30)
	private String local;
	
	/**
	 * Evento que a atracao pertence
	 */
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "evento")
	private EventoEntity evento;
	
	@Transient
	private boolean _newEntity;
	
	@Override
	public java.util.UUID getPk() {
		return this.id;
	}
	
	@Override
	public String getServiceEntityName() {
		return "atracao";
	}
	
	public java.util.UUID getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public java.time.Instant getDataHora() {
		return dataHora;
	}
	
	public String getLocal() {
		return local;
	}
	
	public EventoEntity getEvento() {
		return evento;
	}
	
	public void setId(java.util.UUID id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDataHora(java.time.Instant dataHora) {
		this.dataHora = dataHora;
	}
	
	public void setLocal(String local) {
		this.local = local;
	}
	
	public void setEvento(EventoEntity evento) {
		this.evento = evento;
	}
	
	@Override
	public boolean isNew() {
		return _newEntity;
	}
	
	public void defineAsNewEntity() {
		this._newEntity = true;
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
	    if (!(obj instanceof AtracaoEntity)) {
	        return false;
	    }
	    AtracaoEntity other = (AtracaoEntity) obj;
	    if (id == null) {
	        return false;
	    }
	    if ((id != null) && !id.equals(other.id)) {
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
	
	void toString(StringBuilder sb, List<Object> appended) {
		AtracaoEntityStringSerializer.INSTANCE.serialize(this, sb, appended);
	}
	
}
