package parte2;

public class Mesa {
    private int numero;
    private String cliente;

    public Mesa(int numero) {
        this.numero = numero;
        cliente = null;
    }

    public static void imprimirEstadoMesas(Mesa[] restaurante) {
        System.out.println("Estado das mesas do restaurante:");
        for (Mesa mesa : restaurante) {
            System.out.println(mesa);
        }
    }

    public boolean reservar(String cliente) {
        if(cliente == null) throw new IllegalArgumentException("Cliente null."); //programação "defensiva"

        if(this.cliente != null) return false; //já reservada

        this.cliente = cliente;
        return true;
    }

    public void libertar() {
        cliente = null;
    }

    @Override
    public String toString() {
        if(cliente != null) {
            return String.format("Mesa %d reservada para cliente %s.", numero, cliente);
        }

        return String.format("Mesa %d está livre.", numero);
    }
}
