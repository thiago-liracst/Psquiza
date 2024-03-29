package Psquiza;

import java.io.Serializable;

public class Item  implements Comparable<Item>, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5246153798773027002L;
	private Integer indice;
	private String item;
	private String status;
	/**
	 * Constroi um item no sistema
	 * @param item
	 * @param indice
	 */
	public Item(String item, Integer indice) {
		this.item = item;
		this.status = "PENDENTE";
		this.indice = indice;
	}
	/**
	 * Representacao em String de um item no sistema
	 */
	@Override
	public String toString() {
		return this.status + " - " + this.item;
	}

	@Override
	public int compareTo(Item o) {
		return this.getIndice().compareTo(o.getIndice());
	}
	/**
	 * Permite que o indice seja acessado
	 * @return
	 */
	public Integer getIndice() {
		return indice;
	}
	/**
	 * Permite que o status seja acessado
	 * @return
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * Permite que o status seja alterado
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * Metodo responsavel por realizar um item, alterando seu status.
	 */
	public void realizar() {
		if(this.status.equals("REALIZADO")) {
			throw new IllegalArgumentException("Item ja executado.");
		}
		this.setStatus("REALIZADO");
		
	}
	
	

}
