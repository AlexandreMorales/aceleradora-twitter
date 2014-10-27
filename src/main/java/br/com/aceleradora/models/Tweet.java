package br.com.aceleradora.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tweet {
	private String mensagem;
	private String autor;
	private String data;

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getData() {
		return data;
	}

	public void setData(Date data) {
		String diaEHora = "";
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		diaEHora+=data.getHours()+":"+data.getMinutes()+":"+data.getSeconds();
		this.data=formatador.format(data)+" "+diaEHora;
	}
}
