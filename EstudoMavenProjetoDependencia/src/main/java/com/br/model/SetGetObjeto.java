package com.br.model;

public class SetGetObjeto {

	public ModelProjeto01 insereValor() {

		ModelProjeto01 modelProjeto01 = new ModelProjeto01();

		modelProjeto01.setId(2222);
		modelProjeto01.setNome("nome - 2 ");
		modelProjeto01.setEndereco("endereco - 2 ");
		modelProjeto01.setCep("cep - 2 ");
		modelProjeto01.setTelefone("telefone - 2 ");
		
		return modelProjeto01;
	}

}
