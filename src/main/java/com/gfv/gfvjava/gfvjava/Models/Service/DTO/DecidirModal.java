package gfvjava.Models.Service.DTO;

public class DecidirModal {
	
	private String tipoCarroceria;
	private float distancia;
	private float pesoVeiculoCarga;
	private String[] modificacoes;
	private String modal;
	
	public DecidirModal() {
		
	}

	public DecidirModal(String tipoCarroceria, float distancia, float pesoVeiculoCarga, String[] modificacoes, String modal) {
		this.tipoCarroceria = tipoCarroceria;
		this.distancia = distancia;
		this.pesoVeiculoCarga = pesoVeiculoCarga;
		this.modificacoes = modificacoes;
		this.modal = modal;
	}

	public String getTipoCarroceria() {
		return tipoCarroceria;
	}

	public void setTipoCarroceria(String tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}

	public float getDistancia() {
		return distancia;
	}

	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}

	public float getPesoVeiculoCarga() {
		return pesoVeiculoCarga;
	}

	public void setPesoVeiculoCarga(float pesoVeiculoCarga) {
		this.pesoVeiculoCarga = pesoVeiculoCarga;
	}

	public String[] getModificacoes() {
		return modificacoes;
	}

	public void setModificacoes(String[] modificacoes) {
		this.modificacoes = modificacoes;
	}

	public String getModal() {
		return modal;
	}

	public void setModal(String modal) {
		this.modal = modal;
	}
}