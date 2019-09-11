package com.br.implementa;

import com.br.interfaces.Interfaceprojeto02;
import com.br.model.ModelProjeto01;

public class Implementar implements Interfaceprojeto02 {

	public ModelProjeto01 setGettributos() {

		ModelProjeto01 modelProjeto01 = new ModelProjeto01();

		modelProjeto01.setId(01);
		modelProjeto01.setNome("nome");
		modelProjeto01.setEndereco("endereco");
		modelProjeto01.setCep("cep");
		modelProjeto01.setTelefone("telefone");

		return modelProjeto01;
	}

}
