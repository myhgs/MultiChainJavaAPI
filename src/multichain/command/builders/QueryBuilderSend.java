/*
 * Copyright (C) 2017 Worldline, Inc.
 *
 * MultiChainJavaAPI code distributed under the GPLv3 license, see COPYING file.
 * https://github.com/SimplyUb/MultiChainJavaAPI/blob/master/LICENSE
 *
 */
package multichain.command.builders;

import multichain.command.MultichainException;

import java.math.BigDecimal;

/**
 * @author gshong by Ub - H. MARTEAU
 * @version 3.0
 */
public class QueryBuilderSend extends QueryBuilderCommon {

	protected Object executeMove(String fromAddress, String toAddress, BigDecimal amount) throws MultichainException {
		return execute(CommandEnum.MOVE, fromAddress, toAddress, amount);
	}

	protected Object executeSendFromAccount(String fromAccount, String toAddress, BigDecimal amount) throws MultichainException {
		return execute(CommandEnum.SENDFROMACCOUNT, fromAccount, toAddress, amount);
	}

}
