package entity;

import jakarta.persistence.*;

public class PessoaDesenvolvedoraService {
  EntityManagerFactory emf =
          Persistence.createEntityManagerFactory("hibernate.ORMExampleOneToMany");

  public void save(PessoaDesenvolvedora p) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    em.persist(p);
    em.getTransaction().commit();
    em.close();
  }
}
