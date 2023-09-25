class Item {

  private int quantidade = 1;
  private final Produto produto;

  Item(Produto produto) {
    this.produto = produto;
  }

  Produto getProduto() {
    return produto;
  }

  int getQuantidade() {
    return quantidade;
  }

  void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  @Override
  public String toString() {
    return quantidade + "x " + produto;
  }

  void incrementar() {
    this.quantidade++;
  }
}
