package Aula.Spring.Security.model;

import Aula.Spring.Security.enums.PedidoStatus;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class OrderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;

    @OneToMany
    private List<PedidoModel> pedidos;

    public OrderModel() {

    }

    private PedidoStatus status;
    public PedidoStatus getStatus() {
        return status;
    }

    public void setStatus(PedidoStatus status) {}
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<PedidoModel> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<PedidoModel> pedidos) {
        this.pedidos = pedidos;
    }
}
