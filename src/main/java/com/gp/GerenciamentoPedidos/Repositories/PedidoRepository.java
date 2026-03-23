package com.gp.GerenciamentoPedidos.Repositories;

import com.gp.GerenciamentoPedidos.Models.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<PedidoModel, Long> {
}
