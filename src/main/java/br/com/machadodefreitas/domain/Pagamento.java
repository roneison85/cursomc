package br.com.machadodefreitas.domain;

import java.io.Serializable;

import br.com.machadodefreitas.domain.enums.EstadoPagamento;

public class Pagamento implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private EstadoPagamento estadoPagamento;
	
	public Pagamento() {
	}

	public Pagamento(Integer id, EstadoPagamento estadoPagamento) {
		super();
		this.id = id;
		this.estadoPagamento = estadoPagamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EstadoPagamento getEstadoPagamento() {
		return estadoPagamento;
	}

	public void setEstadoPagamento(EstadoPagamento estadoPagamento) {
		this.estadoPagamento = estadoPagamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pagamento other = (Pagamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}