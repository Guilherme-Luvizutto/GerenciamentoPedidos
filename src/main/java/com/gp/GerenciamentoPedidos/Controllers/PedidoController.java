package com.gp.GerenciamentoPedidos.Controllers;

import com.gp.GerenciamentoPedidos.Models.PedidoModel;
import com.gp.GerenciamentoPedidos.Repositories.PedidoRepository;
import com.gp.GerenciamentoPedidos.Services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public ResponseEntity<PedidoModel> salvarPedidos(@RequestBody PedidoModel pedidoModel) {
        PedidoModel request = pedidoService.criarPedido(pedidoModel);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(pedidoModel.getId()).toUri();
        return ResponseEntity.created(uri).body(pedidoModel);
    }

    @GetMapping
    public ResponseEntity<List<PedidoModel>> findAll() {
        List<PedidoModel> request = pedidoService.findAll();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PedidoModel> findById(@PathVariable Long id) {
        PedidoModel pedido = pedidoService.findById(id);
        return ResponseEntity.ok().body(pedido);
    }

    @DeleteMapping
    public ResponseEntity<?> deletarPedidos(@PathVariable Long id) {
        pedidoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
