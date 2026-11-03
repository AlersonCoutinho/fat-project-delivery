package com.deliverytech.delivery_api.services;

import java.util.List;

import com.deliverytech.delivery_api.dto.req.ClienteReqDTO;
import com.deliverytech.delivery_api.dto.res.ClienteResDTO;

public interface ClienteService {

    ClienteResDTO cadastrarCliente(ClienteReqDTO dto);

    ClienteResDTO buscarClientePorId(Long id);

    ClienteResDTO buscarClientePorEmail(String email);

    ClienteResDTO atualizarCliente(Long id, ClienteReqDTO dto);

    ClienteResDTO ativarDesativarCliente(Long id);

    List<ClienteResDTO> listarClientesAtivos();

}