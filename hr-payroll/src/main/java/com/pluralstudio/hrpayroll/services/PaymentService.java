package com.pluralstudio.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pluralstudio.hrpayroll.entities.Payment;
import com.pluralstudio.hrpayroll.entities.Worker;
import com.pluralstudio.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	

	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workId,int days) {
	
		
		Worker worker = workerFeignClient.findById(workId).getBody();
		return new Payment(worker.getName(),worker.getDailyIncome(),days);
		
	}

}
