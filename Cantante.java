public class Cantante{
    private String nombre;
    private boolean peloRapado;
    private int numeroGrammys;

    public Cantante (String nombreArtistico, int numeroDeGrammys){
        nombre = nombreArtistico;
        peloRapado = false;
        numeroGrammys = numeroDeGrammys;
    }
    public String getNombre(){
        return nombre;
    }
    public boolean getPeloRapado(){
        return peloRapado;
    }
    public int getNumeroGrammys(){
        return numeroGrammys;
    }
    
    public void setNombre(String nombreArtistico){
        nombre = nombreArtistico;
    }
    public void setNumeroGrammys(int numeroDeGrammys){
        numeroGrammys = numeroDeGrammys;
    }
    public void setPeloRapado(){
        peloRapado = !peloRapado;
    } 
}