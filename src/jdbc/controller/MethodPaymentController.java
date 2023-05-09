package jdbc.controller;

import java.util.List;

import jdbc.dao.MethodPaymentDAO;
import jdbc.factory.ConnectionFactory;
import jdbc.model.TypePayment;

public class MethodPaymentController {
	private MethodPaymentDAO methodPaymentDAO;
	
	public MethodPaymentController() {
		ConnectionFactory factory = new ConnectionFactory();
		this.methodPaymentDAO = new MethodPaymentDAO(factory.recuperaConexion());
	}
	
	public List<TypePayment> getMethodPayment() {
		return methodPaymentDAO.getMethodPayment();
	}
}