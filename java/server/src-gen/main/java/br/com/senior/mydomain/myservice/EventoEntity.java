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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;

import br.com.senior.custom.CustomEntity;
import br.com.senior.custom.odata.entity.ODataEntity;

import javax.persistence.CollectionTable;
import javax.persistence.JoinColumn;
import javax.persistence.ElementCollection;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import java.util.Optional;
import javax.persistence.Transient;
import org.springframework.data.domain.Persistable;

@Entity(name="my_domain.my_service.EventoEntity")
@ODataEntity(id = "evento")
@Table(name="evento")
public class EventoEntity extends CustomEntity implements Persistable<java.util.UUID> {
	
	public static final String SECURITY_RESOURCE = "res://senior.com.br/my_domain/my_service/entities/evento";

	/**
	 * ID do evento
	 */
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", updatable = false)
	private java.util.UUID id;
	
	/**
	 * Nome do evento
	 */
	@Column(name = "nome", length = 30)
	private String nome;
	
	@Column(name = "lotacao_maxima")
	private Long lotacaoMaxima;
	
	/**
	 * Data e hora do evento
	 */
	@Column(name = "data_hora")
	private java.time.Instant dataHora;
	
	/**
	 * Enderenço do evento
	 */
	@Column(name = "endereco", length = 50)
	private String endereco;
	
	/**
	 * Tipos de entrada permitidos no evento
	 */
	@Enumerated(EnumType.STRING)
	@ElementCollection(targetClass = TipoEntrada.class, fetch = FetchType.EAGER)
	@CollectionTable(name="tipoentradaevento_evento", joinColumns = {@JoinColumn(name="evento_id")})
	@Column(name = "tipoentradaevento")
	private java.util.Set<TipoEntrada> tipoentradaevento = new java.util.HashSet<>();
	
	/**
	 * Ingressos do evento
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "evento", cascade = CascadeType.ALL, orphanRemoval = true)
	private java.util.List<IngressoEntity> ingressos = new ArrayList<>();
	
	@Transient
	private boolean _newEntity;
	
	@Override
	public java.util.UUID getPk() {
		return this.id;
	}
	
	@Override
	public String getServiceEntityName() {
		return "evento";
	}
	
	public java.util.UUID getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Long getLotacaoMaxima() {
		return lotacaoMaxima;
	}
	
	public java.time.Instant getDataHora() {
		return dataHora;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public java.util.Set<TipoEntrada> getTipoentradaevento() {
		return tipoentradaevento;
	}
	
	public java.util.List<IngressoEntity> getIngressos() {
		return ingressos;
	}
	
	public void setId(java.util.UUID id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setLotacaoMaxima(Long lotacaoMaxima) {
		this.lotacaoMaxima = lotacaoMaxima;
	}
	
	public void setDataHora(java.time.Instant dataHora) {
		this.dataHora = dataHora;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setTipoentradaevento(java.util.Set<TipoEntrada> tipoentradaevento) {
		this.tipoentradaevento = tipoentradaevento;
	}
	
	public void setIngressos(List<IngressoEntity> ingressos) {
		if (ingressos != null) {
			ingressos.forEach(this::addToIngressos);
		} else {
			final List<IngressoEntity> current = new ArrayList<IngressoEntity>();
			current.addAll(this.ingressos);
			current.forEach(this::removeFromIngressos);
		}
	}
	
	public void addToIngressos(IngressoEntity ingressoEntity) {
		if (ingressoEntity.getId() == null || !ingressos.contains(ingressoEntity)) {
			ingressos.add(ingressoEntity);
			ingressoEntity.setEvento(this);
		} else {
			//required for merge operations
			ingressos.remove(ingressos.indexOf(ingressoEntity));
			ingressos.add(ingressoEntity);
			ingressoEntity.setEvento(this);
		}
	}
	
	public IngressoEntity getFromIngressos(java.util.UUID ingressoEntityId) {
		Optional<IngressoEntity> entity = ingressos.stream().filter(e -> e.getId().equals(ingressoEntityId)).findFirst();
		if (entity.isPresent()) {
			return entity.get();
		}
		return null;
	}
	
	public void removeFromIngressos(IngressoEntity ingressoEntity) {
		ingressos.remove(ingressoEntity);
		ingressoEntity.setEvento(null);
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
	    if (!(obj instanceof EventoEntity)) {
	        return false;
	    }
	    EventoEntity other = (EventoEntity) obj;
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
		EventoEntityStringSerializer.INSTANCE.serialize(this, sb, appended);
	}
	
}
