package com.br.main;

import com.br.implementa.Implementar;
import com.br.model.ModelProjeto01;
import com.br.model.SetGetObjeto;

public class Main {
	
	static ModelProjeto01 modelProjeto01 = null;

	public static void main(String[] args) {
		
		Implementar implementar = new Implementar();
		
		modelProjeto01 = implementar.setGettributos();		
		
		System.out.println(modelProjeto01.getId());
		System.out.println(modelProjeto01.getNome());
		System.out.println(modelProjeto01.getEndereco());
		System.out.println(modelProjeto01.getCep());
		System.out.println(modelProjeto01.getTelefone());
		
		SetGetObjeto setGetObjeto = new SetGetObjeto();
		
		modelProjeto01 = setGetObjeto.insereValor();
		
		System.out.println("\n\n"+modelProjeto01.getId());
		System.out.println(modelProjeto01.getNome());
		System.out.println(modelProjeto01.getEndereco());
		System.out.println(modelProjeto01.getCep());
		System.out.println(modelProjeto01.getTelefone());
		

	}

}
