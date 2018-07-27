package br.com.ractecnologia.springbootcity.repository;

import br.com.ractecnologia.springbootcity.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
