package lk.ijse.carRental.service;

import lk.ijse.carRental.dto.PaymentDTO;

import java.util.List;

public interface PaymentService {
    void paymentSave(PaymentDTO paymentDTO);
    void deletepayment(String paymentId);
    void updatepayment(PaymentDTO paymentDTO);
    PaymentDTO serachpayment(String paymentId);
    List<PaymentDTO> getAllpayment();
}
