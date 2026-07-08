package POO.Interface.fixacao;

import java.util.function.DoubleToLongFunction;

public interface OnlinePaymentService {
    Double paymentFee(Double amount);
    Double interest(Double amount, Integer months);
}
