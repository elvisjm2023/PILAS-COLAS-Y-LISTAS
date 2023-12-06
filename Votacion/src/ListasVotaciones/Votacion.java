package ListasVotaciones;

public class Votacion {

    public static void main(String[] args) {
        
        ListaMultienlazada lista = new ListaMultienlazada();
        
        lista.insertarInicio(4, "ADN", "Daniel Noboa");
        lista.insertarInicio(5, "RC", "Luisa González");
        
        // Votar 5 veces por Daniel Noboa
        for (int i = 0; i < 5; i++) {
            lista.votar(4);
        }
        
        // Votar 3 veces por Luisa González
        for (int i = 0; i < 3; i++) {
            lista.votar(5);
        }
        
        lista.mostrarLista();
        
        lista.determinarGanador();
        
    }

}

