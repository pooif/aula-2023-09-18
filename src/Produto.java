import java.util.UUID;

class Produto {

  private final UUID id;
  private final String descricao;
  private final Integer preco;
  private Fabricante fabricante; // agregação
  
  Produto(UUID id, String descricao, Integer preco, Fabricante fabricante) {
    this.id = id;
    this.descricao = descricao;
    this.preco = preco;
    this.fabricante = fabricante;
  }

  Produto(String descricao, Integer preco, Fabricante fabricante) {
    this(UUID.randomUUID(), descricao, preco, fabricante);
  }

  public UUID getId() {
    return id;
  }

  public String getDescricao() {
    return descricao;
  }

  public Fabricante getFabricante() {
    return fabricante;
  }

  public void setFabricante(Fabricante fabricante) {
    this.fabricante = fabricante;
  }

  public Integer getPreco() {
    return preco;
  }

  public String toString() {
    return id + " " + descricao;
  }

  @Override
  public int hashCode() {
    return id.hashCode();
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Produto) {
      Produto outro = (Produto) o;
      return this.id.equals(outro.id);
    }
    return false;
  }
}
