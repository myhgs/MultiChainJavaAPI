/*
 * Copyright (C) 2017 Worldline, Inc.
 *
 * MultiChainJavaAPI code distributed under the GPLv3 license, see COPYING file.
 * https://github.com/SimplyUb/MultiChainJavaAPI/blob/master/LICENSE
 *
 */
package multichain.test.command;

import multichain.command.MultiChainCommand;
import multichain.command.MultichainException;
import multichain.object.Address;
import multichain.object.Balance;

import java.util.List;

/**
 * @author Ub - H. MARTEAU
 * @version 3.2
 */
public class BalanceCommandTest {
	static MultiChainCommand multiChainCommand;

	/**
	 *
	 */
	public BalanceCommandTest() {
		// TODO Auto-generated constructor stub
	}

	private static void testgetBalance(String account) {
		Balance result = null;
		try {
			result = multiChainCommand.getBalanceCommand().getBalance(account);
		} catch (MultichainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == null) {
			System.err.println("testgetBalance - result list is empty");
		} else {
			System.out.println("testgetBalance - Result :"+result.getAmount());
		}
		System.out.println("");
		System.out.println("");
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("--- Start of TestgetBalance ---");
		// BlockChain TestCommand has to be created and started before
		multiChainCommand = new MultiChainCommand(
				"192.168.0.168",
				"7703",
				"hyun",
				"mt393939");
		testgetBalance("hong");
		testgetBalance("");
		System.out.println();
		System.out.println();

		System.out.println("--- End of AddressCommandTest ---");
	}

}
