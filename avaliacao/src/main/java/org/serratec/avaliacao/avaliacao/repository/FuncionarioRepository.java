package org.serratec.avaliacao.avaliacao.repository;

import org.serratec.avaliacao.avaliacao.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}
