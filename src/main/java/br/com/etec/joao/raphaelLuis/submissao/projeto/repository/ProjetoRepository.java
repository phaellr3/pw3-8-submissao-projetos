package br.com.etec.joao.raphaelLuis.submissao.projeto.repository;

import br.com.etec.joao.raphaelLuis.submissao.projeto.entity.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}
