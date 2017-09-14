/*
 * Copyright (C) 2017 Worldline, Inc.
 *
 * MultiChainJavaAPI code distributed under the GPLv3 license, see COPYING file.
 * https://github.com/SimplyUb/MultiChainJavaAPI/blob/master/LICENSE
 *
 */
package multichain.command;

import multichain.command.builders.QueryBuilderSend;

import java.math.BigDecimal;

/**
 * @author gshong by Ub - H. MARTEAU
 * @version 3.0
 */
public class SendCommand extends QueryBuilderSend {

	public SendCommand(String ip, String port, String login, String password) {
		initialize(ip, port, login, password);
	}

	/***
	 *
	 * @param fromAddress
	 * @param toAddress
	 * @param amount
	 * @return boolean
	 * @throws MultichainException
	 */
	public boolean move(String fromAddress, String toAddress, BigDecimal amount) throws MultichainException {
		boolean result = false;
		result = (Boolean) executeMove(fromAddress, toAddress, amount);
		return result;
	}

	/***
	 *
	 * @param fromAccount
	 * @param toAddress
	 * @param amount
	 * @return String (txid)
	 * @throws MultichainException
	 */
	public String sendFromAccount(String fromAccount, String toAddress, BigDecimal amount) throws MultichainException {
		String result = null;
		result = (String) executeSendFromAccount(fromAccount, toAddress, amount);
		return result;
	}

}
