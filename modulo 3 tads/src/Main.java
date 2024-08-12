import java.util.ArrayList;
import java.util.List;

class Pedido {
    private Integer id;
    private Integer clienteId;
    private String dataPedido;
    private Double valorTotal;

    public Pedido(Integer id, Integer clienteId, String dataPedido, Double valorTotal) {
        this.id = id;
        this.clienteId = clienteId;
        this.dataPedido = dataPedido;
        this.valorTotal = valorTotal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(1, 101, "2024-06-15", 150.75));
        pedidos.add(new Pedido(2, 102, "2024-04-22", 200.50));
        pedidos.add(new Pedido(3, 103, "2024-02-10", 120.00));
        for (Pedido pedido : pedidos) {
            System.out.println("ID: " + pedido.getId());
            System.out.println("Cliente ID: " + pedido.getClienteId());
            System.out.println("Data do Pedido: " + pedido.getDataPedido());
            System.out.println("Valor Total: " + pedido.getValorTotal());
            System.out.println();
        }
    }
}
