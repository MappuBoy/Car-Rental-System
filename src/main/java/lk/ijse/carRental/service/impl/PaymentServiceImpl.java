package lk.ijse.carRental.service.impl;

import lk.ijse.carRental.dto.PaymentDTO;
import lk.ijse.carRental.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PaymentServiceImpl implements PaymentService {
    @Autowired
    
    @Override
    public void paymentSave(PaymentDTO paymentDTO) {

    }

    @Override
    public void deletepayment(String paymentId) {

    }

    @Override
    public void updatepayment(PaymentDTO paymentDTO) {

    }

    @Override
    public PaymentDTO serachpayment(String paymentId) {
        return null;
    }

    @Override
    public List<PaymentDTO> getAllpayment() {
        return null;
    }
}
