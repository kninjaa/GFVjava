package com.gfv.gfvjava.gfvjava.Models.Service.DTO;

import java.util.ArrayList;

public class EnviarInformacoes {
	
	private CadastrarCliente[] itensCadastro;
//	private DecidirModal informacoesModal;
	private ArrayList<GerarProtocolo> listaProtocolo;
//	private CarroPorto[] infoCarroPorto;
//	private FuncionarioPorto[] funcionario;
	
	public EnviarInformacoes() {
		
	}
	
//	public EnviarInformacoes(CadastrarCliente[] itensCadastro, DecidirModal informacoesModal, ArrayList<GerarProtocolo> listaProtocolo, CarroPorto[] infoCarroPorto, FuncionarioPorto[] funcionario) {
//		this.itensCadastro = itensCadastro;
//		this.informacoesModal = informacoesModal;
//		this.listaProtocolo = listaProtocolo;
//		this.infoCarroPorto = infoCarroPorto;
//		this.funcionario = funcionario;
//	}

	public CadastrarCliente[] getItensCadastro() {
		return itensCadastro;
	}

	public void setItensCadastro(CadastrarCliente[] itensCadastro) {
		this.itensCadastro = itensCadastro;
	}

//	public DecidirModal getInformacoesModal() {
//		return informacoesModal;
//	}
//
//	public void setInformacoesModal(DecidirModal informacoesModal) {
//		this.informacoesModal = informacoesModal;
//	}

	public ArrayList<GerarProtocolo> getListaProtocolo() {
		return listaProtocolo;
	}

	public void setListaProtocolo(ArrayList<GerarProtocolo> listaProtocolo) {
		this.listaProtocolo = listaProtocolo;
	}

//	public CarroPorto[] getInfoCarroPorto() {
//		return infoCarroPorto;
//	}
//
//	public void setInfoCarroPorto(CarroPorto[] infoCarroPorto) {
//		this.infoCarroPorto = infoCarroPorto;
//	}
//
//	public FuncionarioPorto[] getFuncionario() {
//		return funcionario;
//	}
//
//	public void setFuncionario(FuncionarioPorto[] funcionario) {
//		this.funcionario = funcionario;
//	}
	
	
	
	
}
