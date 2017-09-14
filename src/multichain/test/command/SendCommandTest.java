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
import multichain.object.Balance;

import java.math.BigDecimal;

/**
 * @author Ub - H. MARTEAU
 * @version 3.2
 */
public class SendCommandTest {
	static MultiChainCommand multiChainCommand;

	/**
	 *
	 */
	public SendCommandTest() {
		// TODO Auto-generated constructor stub
	}

	private static void testMove(String fromAddress, String toAddress, BigDecimal amount) {
		boolean result = false;
		try {
			result = multiChainCommand.getSendCommand().move(fromAddress, toAddress, amount);
		} catch (MultichainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("testMove - Result :"+result);
		System.out.println("testMove - from Address :"+fromAddress);
		System.out.println("testMove - to Address :"+toAddress);
		System.out.println("testMove - Amount :"+amount.toPlainString());
		System.out.println("");
		System.out.println("");
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("--- Start of testMove ---");
		// BlockChain TestCommand has to be created and started before
		multiChainCommand = new MultiChainCommand(
				"192.168.0.168",
				"7703",
				"hyun",
				"mt393939");
		testMove("","H9WP5xKUF19hnuZYpG5hJK8jjZAhDaL7sa", new BigDecimal(1.3));
		System.out.println();
		System.out.println();

		System.out.println("--- End of testMove ---");
	}

}
