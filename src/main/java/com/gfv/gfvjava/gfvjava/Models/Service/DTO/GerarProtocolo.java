package com.gfv.gfvjava.gfvjava.Models.Service.DTO;

import java.sql.Date;
import java.util.ArrayList;

public class GerarProtocolo {
	
	private String idProtocolo;
	private Date dataAcionamento;
	//private ArrayList<CadastrarCliente> itensProtocolo;
	
	public GerarProtocolo() {
		
	}

	public GerarProtocolo(String idProtocolo, Date dataAcionamento, ArrayList<CadastrarCliente> itensProtocolo) {
		this.idProtocolo = idProtocolo;
		this.dataAcionamento = dataAcionamento;
		//this.itensProtocolo = itensProtocolo;
	}

	public String getIdProtocolo() {
		return idProtocolo;
	}

	public void setIdProtocolo(String idProtocolo) {
		this.idProtocolo = idProtocolo;
	}

	public Date getDataAcionamento() {
		return dataAcionamento;
	}

	public void setDataAcionamento(Date dataAcionamento) {
		this.dataAcionamento = dataAcionamento;
	}

//	public ArrayList<CadastrarCliente> getItensProtocolo() {
//		return itensProtocolo;
//	}
//
//	public void setItensProtocolo(ArrayList<CadastrarCliente> itensProtocolo) {
//		this.itensProtocolo = itensProtocolo;
//	}
	
	
	
	
}
