package lk.ijse.carRental.service.impl;

import lk.ijse.carRental.dto.PaymentDTO;
import lk.ijse.carRental.entity.Payment;
import lk.ijse.carRental.repo.PaymentRepo;
import lk.ijse.carRental.service.PaymentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepo repo;
    @Autowired
    private ModelMapper mapper;
    @Override
    public void paymentSave(PaymentDTO paymentDTO) {

        if (!repo.existsById(paymentDTO.getPaymentId())) {
            repo.save(mapper.map(paymentDTO, Payment.class));
        } else {
            throw new RuntimeException("Item Already Exist.!");
        }
    }

    @Override
    public void deletepayment(String paymentId) {
        if (repo.existsById(paymentId)) {
            repo.deleteById(paymentId);
        } else {
            throw new RuntimeException("Delete Failed, No Item Available For " + paymentId);
        }
    }

    @Override
    public void updatepayment(PaymentDTO paymentDTO) {
        if (repo.existsById(paymentDTO.getPaymentId())) {
            repo.save(mapper.map(paymentDTO, Payment.class));
        } else {
            throw new RuntimeException("Update Failed, No Item Available For " + paymentDTO.getPaymentId());
        }
    }

    @Override
    public PaymentDTO serachpayment(String paymentId) {
        if (repo.existsById(paymentId)) {
            return mapper.map(repo.findById(paymentId), PaymentDTO.class);
        } else {
            throw new RuntimeException("Search Failed, No Item Available For " + paymentId);
        }
    }

    @Override
    public List<PaymentDTO> getAllpayment() {
        return mapper.map(repo.findAll(), new TypeToken<List<PaymentDTO>>() {
        }.getType());
    }
}
