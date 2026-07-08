package POO.Interface.fixacao;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService paymentService;

    public ContractService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, int months) {
        contract.getInstallments().add(new Installments(LocalDate.of(2018, 3, 12), 202.2));
        contract.getInstallments().add(new Installments(LocalDate.of(2018, 4, 12), 206.4));
    }
}
