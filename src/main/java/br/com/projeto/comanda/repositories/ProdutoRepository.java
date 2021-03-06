package br.com.projeto.comanda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.comanda.domain.Produto;
import br.com.projeto.comanda.repositories.produto.ProdutoRepositoryQuery;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>,ProdutoRepositoryQuery{

}
