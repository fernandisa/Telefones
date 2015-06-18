package telefone;

public class Celular extends Telefones1 {
  
    private boolean msgdetexto;
    private boolean despertador;
    private Telefones1 telefone;
    

    public boolean isMsgdetexto() {
        return msgdetexto;
    }

    public void setMsgdetexto(boolean msgdetexto) {
        this.msgdetexto = msgdetexto;
    }

    public boolean isDespertador() {
        return despertador;
    }
    

    public void setDespertador(boolean despertador) {
        this.despertador = despertador;
    }

    public Telefones1 getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefones1 telefone) {
        this.telefone = telefone;
    }

    

    
    

}
