package br.com.aceleradora.controller;

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

	public IndexController(BancoDeDados bd) {
		this.bd = bd;
	}

	@Path("/")
	public List<Tweet> index(Result result) {
		if(bd.todosTweets().size() != 0){
			result.include("autorAnterior", bd.todosTweets().get(bd.todosTweets().size() - 1).getAutor());
		}
		return bd.todosTweets();
	}
	
	

	public void twittar(Tweet tweet, Result result) {
		tweet.setData(new Date());
		bd.adicionaTweet(tweet);			
		result.forwardTo(this).index(result);
	}

	public void delete(int id, Result result) {
		bd.removeTweet(id);
		result.forwardTo(this).index(result);
	}
	
	public void edite(int id, String mensagem, Result result) {
		System.out.println(id + " " + mensagem);
		bd.editeTweet(id, mensagem);
		result.forwardTo(this).index(result);
	}
}
