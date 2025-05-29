public record NinjaRecord(String nome, String email, int telefone) {

    public String retornaEmailCaixaAlta(){
        return email.toUpperCase();
    }

}
