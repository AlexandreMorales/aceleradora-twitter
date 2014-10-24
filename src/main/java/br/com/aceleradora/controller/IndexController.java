package br.com.aceleradora.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.aceleradora.models.BancoDeDados;
import br.com.aceleradora.models.Tweet;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class IndexController {
	private BancoDeDados bd;
	
	public IndexController(BancoDeDados bd){
		this.bd = bd;
		//bd = new BancoDeDados();
	}
	
	@Path("/")
	public void index() {
	}

	public void recebeDados(String dado, Result result) {
		try {
			int dados = Integer.parseInt(dado);
			dado += (dados) * 0.5;
		} catch (Exception e) {
		}
		result.include("dado", dado + " " + new Date());
	}

	public List<Tweet> twittar(Tweet tweet, Result result) {
		bd.adicionaTweet(tweet);
		//result.forwardTo(this).recebeDados(tweet.getMensagem(), result);
		return bd.todosTweets();
	}
}
