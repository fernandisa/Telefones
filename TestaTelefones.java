package telefone;

import javax.swing.JOptionPane;

public class TestaTelefones {

    public static void main(String[] args) {
//       // Telefone
//        
//       Telefone tel = new Telefone ();
//       tel.setCor("Vermelho");
//       tel.setModelo("Velho");
//       tel.setPeso(2.0);
       
       // Celular
       
       Celular cel = new Celular ();
       Telefones1 tel2 = new Telefones1 ();
       tel2.setCor("Azul");
       tel2.setModelo("Nokia");
       tel2.setPeso(100.0);
       cel.setTelefone(tel2);
       cel.setDespertador(true);
       cel.setMsgdetexto(true);
       
       // Telefone sem fio
       
       TelefoneSemFio semfio = new TelefoneSemFio ();
       Telefones1 tel3 = new Telefones1 ();
       tel3.setCor("Preto");
       tel3.setModelo("Intelbras");
       tel3.setPeso(45.0);
       
       semfio.setAlcance("10 metros");
       semfio.setSecretaria(true);
       semfio.setTelefone(tel3);
       
       // Smartphone
       
       Smartphone smart = new Smartphone ();
       Telefones1 tel4 = new Telefones1 ();
       tel4.setCor("Cinza");
       tel4.setModelo("Apple");
       tel4.setPeso(20.0);
       
       smart.setDespertador(true);
       smart.setMsgdetexto(true);
       smart.setResolucao("1334x750 pixel");
       smart.setWifi(true);
       smart.setTelefone(tel4);
       
       JOptionPane.showMessageDialog(null, "***************Telefones***************\nCelular:\nCor: " + cel.getTelefone().getCor() + "\nModelo: " + cel.getTelefone().getModelo()
       + "\nPeso: " + cel.getTelefone().getPeso() + "\nMensagem de texto: " + cel.isDespertador() );
       JOptionPane.showMessageDialog(null,"Telefone sem fio:\nCor: " + semfio.getTelefone().getCor() + "\nModelo: " + semfio.getTelefone().getModelo()
       + "\nPeso: " + semfio.getTelefone().getPeso() + "\nSecretrária eletrônica: " + semfio.isSecretaria() + "\nAlcance: " + semfio.getAlcance());
       
       JOptionPane.showMessageDialog (null, "Smartphone: \nCor: " + smart.getTelefone().getCor() + "\nModelo: " + smart.getTelefone().getModelo() + "\nPeso: " + 
       smart.getTelefone().getPeso() + "\n2G: " + smart.isDoisg() + "\nDespertador: " + smart.isDespertador() + "\nWifi: " + smart.isWifi() + "\nMensagem de texto:" +
       smart.isMsgdetexto());

       
    }
    
}
