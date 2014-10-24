package br.com.aceleradora.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;

@Component
@SessionScoped
public class BancoDeDados{
	private List<Tweet> tweets;
	
	public BancoDeDados(){
		tweets = new ArrayList<Tweet>();
	}
	
	public void adicionaTweet(Tweet tweet){
		tweets.add(0, tweet);
	}
	
	public void removeTweet(int id){
		tweets.remove(id);
	}
	
	public List<Tweet> todosTweets(){
		return tweets;
	}

	public void editeTweet(int id, String mensagem) {
		tweets.get(id).setMensagem(mensagem);
		tweets.get(id).setData(new Date());
	}
}
