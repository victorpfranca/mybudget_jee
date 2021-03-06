package br.com.victorpfranca.mybudget.transaction.rules;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class InvalidTransactionSerieDateException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidTransactionSerieDateException(String message) {
		super(message);
	}

	public InvalidTransactionSerieDateException(String message, Throwable cause) {
		super(message, cause);
	}

}
