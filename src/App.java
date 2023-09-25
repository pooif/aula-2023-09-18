class App {
  public static void main(String[] args) {
    System.out.println("OK");

    Fabricante f1 = new Fabricante("Nestle");
    Produto p1 = new Produto("Bis", 7, f1);
    Produto p2 = new Produto("Caneta", 3, new Fabricante("BIC"));

    p1.setFabricante(new Fabricante("Abc"));

    System.out.println(f1);
    System.out.println(p1);
    System.out.println(p2);

    Carrinho carrinho = new Carrinho();
    System.out.println(carrinho);
    
    carrinho.adicionarProduto(p1);
    System.out.println(carrinho);
    
    carrinho.adicionarProduto(p2);
    System.out.println(carrinho);
    
    carrinho.adicionarProduto(p2);
    carrinho.adicionarProduto(p2);
    carrinho.adicionarProduto(p2);
    System.out.println(carrinho);

    // "puxadinho" ou train wreck
    // usuario.getPerfil().getAutenticacao().setSenha(Random.newRandom());
    // usuario.gerarNovaSenha(); // formalizado
    
    // evitar navegar no grafo e setar diretamente
    // train wreck
    carrinho.getItens().get(1).setQuantidade(-10);
    System.out.println(carrinho);

    // Navegar no grafo de objetos/atravessar (traverse) o grafo de objetos
    // Nome do Fabricante do Produto 1
    System.out.println(p1.getFabricante().getNome());

    // navegar no grafo
    System.out.println(carrinho.getItens().get(0).getProduto().getFabricante().getNome());
    
    // atravessando o grafo
    // System.out.println(prod.getFabricante().getFundador().getCidade().getEstado();


  }
}