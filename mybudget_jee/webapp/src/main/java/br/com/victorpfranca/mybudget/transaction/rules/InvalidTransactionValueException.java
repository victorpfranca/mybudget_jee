package br.com.victorpfranca.mybudget.transaction.rules;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class InvalidTransactionValueException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidTransactionValueException(String message) {
		super(message);
	}

	public InvalidTransactionValueException(String message, Throwable cause) {
		super(message, cause);
	}

}
