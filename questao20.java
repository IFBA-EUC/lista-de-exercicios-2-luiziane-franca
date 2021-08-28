public class questao19 {

    
    public static void main(String[] args) {
        // questão 20
        Contato c = new Contato("Mãe", "12312312");
        Agenda a = new Agenda();
        a.add_contato(c);
        System.out.println(a.total);
        Contato x = a.contatos.get(0);
        System.out.println(x.nome);
    }
    
}