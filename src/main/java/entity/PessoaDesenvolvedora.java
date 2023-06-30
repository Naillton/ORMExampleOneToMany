package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_pessoa_desenvolvedora")
public class PessoaDesenvolvedora {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String nome;

  @OneToMany(mappedBy = "pessoaDesenvolvedora", cascade = CascadeType.PERSIST, orphanRemoval = true)
  // usando o List para criar uma lista de commits.
  private List<Commit> commits = new ArrayList<>();

  public long getId() {
    return this.id;
  }
  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Commit> getCommits() {
    return commits;
  }

  public void setCommits(ArrayList<Commit> commits) {
    this.commits = commits;
  }

  public void addCommits(Commit commit) {
    this.commits.add(commit);
  }
}
