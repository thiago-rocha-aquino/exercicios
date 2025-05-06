public class carro implements veiculo{
    public int q_combustivel;

    public carro(int q_combustivel){

        this.q_combustivel = q_combustivel;
    }

    public void acelerar() {
        System.out.println("Acelerando carro");
    }
    public void frear() {
        System.out.println("Freando carro");
    }
    public void abastecer(int litros) {
        q_combustivel += litros;
        System.out.println("abasteceu: " + litros + "total do combustivel: " + q_combustivel);
    }

}
