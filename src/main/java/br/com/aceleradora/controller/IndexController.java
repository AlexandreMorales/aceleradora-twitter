package br.com.aceleradora.controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class IndexController {
	@Path("/")
	public void index(){
	}
	public void recebeDados(String dado, Result result){
		try{
			int dados = Integer.parseInt(dado);
			dados+=(dados)*0.5;
			result.include("dado", dados+"");
		}catch(Exception e){
			result.include("dado", dado);
		}
	}
}
