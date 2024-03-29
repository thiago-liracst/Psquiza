package Psquiza;

import java.io.Serializable;

public class Objetivo implements Comparable<Objetivo>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1956173619353668987L;
	/**
	 * o codigo identificador do objetivo
	 */
	private String codigo;
	/**
	 * o tipo do objetivo (geral ou especifico)
	 */
	private String tipo;
	/**
	 * a descricao do objetivo
	 */
	private String descricao;
	/**
	 * a aderencia ao problema
	 */
	private Integer aderencia;
	/**
	 * a viabilidade do objetivo
	 */
	private Integer viabilidade;
	/**
	 * Indica se um objetivo ja esta associado
	 * a uma pesquisa
	 */
	private boolean associado;
	/**
	 * Constroi um objetivo no sistema
	 * @param codigo
	 * @param tipo
	 * @param descricao
	 * @param aderencia
	 * @param viabilidade
	 */
	public Objetivo(String codigo, String tipo, String descricao, Integer aderencia, Integer viabilidade) {
		this.codigo = codigo;
		this.tipo = tipo;
		this.descricao = descricao;
		this.aderencia = aderencia;
		this.viabilidade = viabilidade;
		this.associado = false;
	}
	
	public boolean isAssociado() {
		return associado;
	}

	public void setAssociado(boolean associado) {
		this.associado = associado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Objetivo other = (Objetivo) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	/**
	 * Cria uma representacao textual de um objetivo, no formato
	 * "Codigo - Tipo - Descricao - Valor", em que Valor é a soma
	 * de aderencia e viabilidade
	 */
	@Override
	public String toString() {
		return codigo + " - " + tipo + " - " + descricao + " - " + (aderencia+viabilidade);
	}

	public String getDescricao() {
		return this.descricao;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	@Override
	public int compareTo(Objetivo o) {
		return this.codigo.compareTo(o.getCodigo());
	}
}
