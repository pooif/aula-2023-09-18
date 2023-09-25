import java.util.Objects;
import java.util.UUID;

class Fabricante {
  // Universally Unique Identification
  private final UUID id;
  private final String nome;

  Fabricante(String nome) { // new Fabricante("Nestle");
    this(UUID.randomUUID(), nome);
  }

  Fabricante(UUID id, String nome) {
    Objects.requireNonNull(id, "O id é obrigatório");
    Objects.requireNonNull(nome, "O nome é obrigatório");
    this.id = id;
    this.nome = nome;
  }

  public UUID getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  @Override
  public String toString() {
    return "{\"id\": \"" + id + "\", \"nome\": \"" + nome + "\"}";
  }
}
