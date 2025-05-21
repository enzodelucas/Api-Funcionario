package org.serratec.avaliacao.avaliacao.domain;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Embeddable
public class Endereco {
	
	@NotBlank(message = "Preencha a rua")
	@Size(max=30)
	private String rua;
	
	@NotBlank(message = "Preencha a cidade")
	@Size(max=30)
	private String cidade;
	
	@NotBlank(message = "Preencha o estado")
	@Size(max=30)
	private String estado;
	
	@NotBlank(message = "Preencha o CEP")
	@Size(min=1,max=9)
	private String cep;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
}
