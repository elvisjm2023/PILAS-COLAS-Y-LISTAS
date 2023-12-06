package ListasVotaciones;

public class Nodo {
    int numeroLista;
    String nombreAgrupacion;
    String dignidad;
    int votosFavor;
    Nodo siguienteLista;
    Nodo siguienteCandidato;
    
    Nodo(int numeroLista, String nombreAgrupacion, String dignidad) {
        this.numeroLista = numeroLista;
        this.nombreAgrupacion = nombreAgrupacion;
        this.dignidad = dignidad;
        this.votosFavor = 0; 
        this.siguienteLista = null;
        this.siguienteCandidato = null;
    }
}
