public class moto implements veiculo{
    public int q_combustivel;

    public moto(int q_combustivel){
        this.q_combustivel = q_combustivel;
    }
    public void acelerar(){
        System.out.println("acelerando moto");
    }
    public void frear(){
        System.out.println("freando moto");
    }
    public void abastecer(int litros ){
        q_combustivel += litros;
        System.out.println("abasteceu: " + litros + "total do combustivel: " + q_combustivel);
    }
}
