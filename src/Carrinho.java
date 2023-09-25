import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class Carrinho {

  private final UUID id;
  private final List<Item> itens = new ArrayList<>();
  
  Carrinho(UUID id) {
    this.id = id;
  }

  Carrinho() {
    this(UUID.randomUUID());
  }

  public UUID getId() {
    return id;
  }

  public List<Item> getItens() {
    return itens;
  }

  @Override
  public String toString() {
    return "Carrinho [id=" + id + ", itens=" + itens + "]";
  }

  // pidgeon chess

  void adicionarProduto(Produto produto) { // ++

    for (Item item : itens) {
      if (item.getProduto().equals(produto)) {
        // encontrou o produto na lista
        // item.setQuantidade(item.getQuantidade() + 1);
        item.incrementar();
        return; // interromper
      }
    }

    Item item = new Item(produto); // wrapper
    itens.add(item);
  }

  
}
