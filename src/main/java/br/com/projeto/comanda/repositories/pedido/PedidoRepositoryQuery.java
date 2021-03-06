package br.com.projeto.comanda.repositories.pedido;

import java.util.List;

import br.com.projeto.comanda.domain.Pedido;

public interface PedidoRepositoryQuery {

	public List<Pedido> pesquisaTodosPedidos();
	public Pedido pesquisaPedidoPorId(Long id);
	public Pedido salvarPedidoCompleto(Pedido pedido);
	public Long buscaUltimoPedidoSalvo();
	
}
