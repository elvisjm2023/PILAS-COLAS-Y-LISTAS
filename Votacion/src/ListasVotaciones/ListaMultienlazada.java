package ListasVotaciones;

public class ListaMultienlazada {
    
    private Nodo primero;
    
    public ListaMultienlazada() {
        primero = null;
    }
    
    public void insertarInicio(int numeroLista, String nombreAgrupacion, String dignidad) {
        Nodo nuevo = new Nodo(numeroLista, nombreAgrupacion, dignidad);
        nuevo.siguienteLista = primero;
        primero = nuevo;
    }
    
    public void votar(int numeroLista) {
        Nodo actual = buscar(numeroLista);
        if (actual != null) {
            actual.votosFavor++;
        }
    }
    
    public Nodo buscar(int numeroLista) {
        Nodo actual = primero;
        while (actual != null && actual.numeroLista != numeroLista) {
            actual = actual.siguienteLista;
        } 
        return actual;
    }
    
    public void mostrarLista() {
    	System.out.println("*****************************");
    	System.out.println("Resultados de las Votaciones");
    	System.out.println("*****************************");
        Nodo actual = primero;
        while(actual != null) {
            System.out.print("Lista " + actual.numeroLista + " - ");
            System.out.print(actual.nombreAgrupacion + " - "); 
            System.out.print(actual.dignidad + " - ");
            System.out.print("Votos: " + actual.votosFavor);
            System.out.println("");  
            actual = actual.siguienteLista;
        }
    }
    
    public void determinarGanador() {
        Nodo ganador = primero;
        Nodo actual = primero.siguienteLista;
        while (actual != null) {
            if (actual.votosFavor > ganador.votosFavor) {
                ganador = actual;
            }
            actual = actual.siguienteLista;
        }
        System.out.println("El ganador es " + ganador.dignidad + " de la lista " + ganador.numeroLista);
    }
}
