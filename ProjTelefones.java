
package telefone;

public class ProjTelefones {

    public static void main(String[] args) {
        Loja loja = new Loja();
        loja.catalogarTelefones();
        for (int i = 0; i < loja.getVelhos().size(); i++)
        {
            System.out.println(loja.getVelhos().get(i).resumo());
        }
        for (Telefones1 velho : loja.getVelhos())
        {
            System.out.println(velho.resumo);
        }
    }
    
}
