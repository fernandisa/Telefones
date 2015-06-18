
package telefone;

public class TelefoneSemFio extends Telefones1{
    
    
    private boolean secretaria;
    private String alcance;
    private Telefones1 telefone;

    public boolean isSecretaria() {
        return secretaria;
    }

    public void setSecretaria(boolean secretaria) {
        this.secretaria = secretaria;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public Telefones1 getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefones1 telefone) {
        this.telefone = telefone;
    }
    
    

}
