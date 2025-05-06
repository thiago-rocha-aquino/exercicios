import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        carro fusca = new carro(60);
        moto xj = new moto(20);

        ArrayList<veiculo> list = new ArrayList<veiculo>();
        list.add(fusca);
        list.add(xj);

        for (veiculo v :list){
            v.abastecer(40);
            v.frear();
            v.acelerar();
        }


    }
}