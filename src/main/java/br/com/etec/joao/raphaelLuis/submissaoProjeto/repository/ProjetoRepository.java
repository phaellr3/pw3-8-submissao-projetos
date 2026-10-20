package br.com.etec.joao.raphaelLuis.submissaoProjeto.repository;

import br.com.etec.joao.raphaelLuis.submissaoProjeto.entity.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}
