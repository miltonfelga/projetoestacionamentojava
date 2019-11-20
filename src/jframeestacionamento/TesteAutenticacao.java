
package jframeestacionamento;

public class TesteAutenticacao {
    public static void main(String[] args) {
        AUsuario teste= new AUsuario();
        
        teste.setUsuario("Etecia");
        teste.setSenha("etecia");
        
        System.out.println("Usuario: "+teste.getUsuario());
        System.out.println("Senha: "+teste.getSenha());
        
        
    }
}

