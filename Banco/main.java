
public class Main {

	public static void main(String[] args) {
	    
	    Cliente cliente1 = new Cliente();
        cliente1.setNome("João");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria");
		
		Conta cc = new ContaCorrente(cliente1);
		cc.depositar(130);
			
		Conta poupanca = new ContaPoupanca(cliente2);
		poupanca.depositar(390);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

	}

}