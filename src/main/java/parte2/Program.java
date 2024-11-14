package parte2;

public class Program {
    public static void main(String[] args) {
        // Declarar array de mesas, inicialmente com referencias 'null'
        Mesa[] rest = new Mesa[10];

        // Atribuir um objeto Mesa a cada posição da lista
        for(int i = 0; i < rest.length; i++) {
            rest[i] = new Mesa( i + 1 );
        }

        Mesa.imprimirEstadoMesas(rest);

        System.out.println( rest[1].reservar("Zilda") ); //true
        System.out.println( rest[1].reservar("Helder") ); //false
        System.out.println( rest[7].reservar("Ana") ); //true
        System.out.println( rest[8].reservar("Bruno") ); //true

        Mesa.imprimirEstadoMesas(rest);

        rest[1].libertar();

        Mesa.imprimirEstadoMesas(rest);
    }
}

