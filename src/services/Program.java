package services;

public class Program {

	public static void main(String[] args) {
		TaxService taxService = new TaxService();
		DeliverService deliverService = new DeliverService();
		PayService payService = new PayService(taxService, deliverService);
		
		System.out.println("RESULTADO = " + payService.finalPrice(300.0, "SP"));
	}

}
