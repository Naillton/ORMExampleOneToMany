import entity.Commit;
import entity.PessoaDesenvolvedora;
import entity.PessoaDesenvolvedoraService;

public class Main {
  public static void main(String[] args) {
    PessoaDesenvolvedora p = new PessoaDesenvolvedora();
    p.setNome("PD1");

    Commit c = new Commit();
    c.setDescricao("commit pd1");
    c.setPessoaDesenvolvedora(p);

    p.addCommits(c);

    c = new Commit();
    c.setDescricao("Commit2 pd1");
    c.setPessoaDesenvolvedora(p);

    p.addCommits(c);

    c = new Commit();
    c.setDescricao("Commit3 pd1");
    c.setPessoaDesenvolvedora(p);

    p.addCommits(c);

    PessoaDesenvolvedoraService service = new PessoaDesenvolvedoraService();
    service.save(p);

  }
}
