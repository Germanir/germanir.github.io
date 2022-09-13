package br.projetofinal.com.apiloja;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

    @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String produto;
  private String descricao;
  private Float valor;
  private String foto;
  
public Integer getId() {
    return id;
}
public void setId(Integer id) {
    this.id = id;
}
public String getProduto() {
    return produto;
}
public void setProduto(String produto) {
    this.produto = produto;
}
public String getDescricao() {
    return descricao;
}
public void setDescricao(String descricao) {
    this.descricao = descricao;
}
public Float getValor() {
    return valor;
}
public void setValor(Float valor) {
    this.valor = valor;
}
public String getFoto() {
    return foto;
}
public void setFoto(String foto) {
    this.foto = foto;
}

    
}
