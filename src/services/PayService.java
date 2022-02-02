package services;

public class PayService {
	private TaxService taxService;
	private DeliverService deliverService;

	// Inversão de Controle: Programa principal vai injetar dependências
	public PayService(TaxService taxService, DeliverService deliverService) {
		this.taxService = taxService;
		this.deliverService = deliverService;
	}

	public double finalPrice(double cost, String state) {
		double tax = taxService.tax(cost);
		double asd = deliverService.fee(state);
		return cost + asd + tax;
	}

}
