package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_commit")
public class Commit {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String descricao;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "pessoa_desenvolvedora_id")
  private PessoaDesenvolvedora pessoaDesenvolvedora;

  public long getId() {
    return id;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public PessoaDesenvolvedora getPessoaDesenvolvedora() {
    return pessoaDesenvolvedora;
  }

  public void setPessoaDesenvolvedora(PessoaDesenvolvedora pessoaDesenvolvedora) {
    this.pessoaDesenvolvedora = pessoaDesenvolvedora;
  }
}
