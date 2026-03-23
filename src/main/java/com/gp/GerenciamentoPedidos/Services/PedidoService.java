package com.gp.GerenciamentoPedidos.Services;

import com.gp.GerenciamentoPedidos.Models.PedidoModel;
import com.gp.GerenciamentoPedidos.Repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public PedidoModel criarPedido(PedidoModel pedidoModel) {
        return pedidoRepository.save(pedidoModel);
    }

    public List<PedidoModel> findAll() {
        return pedidoRepository.findAll();
    }

    public PedidoModel findById(Long id) {
        return pedidoRepository.findById(id).get();
    }

    public void deleteById(Long id) {
        pedidoRepository.deleteById(id);
    }
}
