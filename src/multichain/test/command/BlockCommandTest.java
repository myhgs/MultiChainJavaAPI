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
import multichain.object.Block;

/**
 * @author Ub - H. MARTEAU
 * @version 2.0
 */
public class BlockCommandTest {
	static MultiChainCommand multiChainCommand;

	/**
	 *
	 */
	public BlockCommandTest() {
		// TODO Auto-generated constructor stub
	}

	private static void testgetBlock() {
		Block result = null;
		try {
			result = multiChainCommand.getBlockCommand().getBlock(1);
		} catch (MultichainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Result Block(1) (default verbose) :" + result);
		System.out.println("");

		try {
			result = multiChainCommand.getBlockCommand().getBlock(1, true);
		} catch (MultichainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Result Block(1) (default verbose=true) :" + result);
		System.out.println("");

		try {
			result = multiChainCommand.getBlockCommand().getBlock(1, false);
		} catch (MultichainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Result Block(1) (default verbose=false) :" + result);

		System.out.println("");
		System.out.println("");

		//
		try {
			result = multiChainCommand.getBlockCommand().getBlock(
					"0074ba967e7f7c3b04ed0429b796900136d82b52ecf44d5878f1f2dfdf5e1fb8");
		} catch (MultichainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out
				.println("Result Block(0074ba967e7f7c3b04ed0429b796900136d82b52ecf44d5878f1f2dfdf5e1fb8) (default verbose) :"
						+ result);
		System.out.println("");

		try {
			result = multiChainCommand.getBlockCommand().getBlock(
					"0074ba967e7f7c3b04ed0429b796900136d82b52ecf44d5878f1f2dfdf5e1fb8", true);
		} catch (MultichainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out
				.println("Result Block(0074ba967e7f7c3b04ed0429b796900136d82b52ecf44d5878f1f2dfdf5e1fb8) (default verbose=true) :"
						+ result);
		System.out.println("");

		try {
			result = multiChainCommand.getBlockCommand().getBlock(
					"0074ba967e7f7c3b04ed0429b796900136d82b52ecf44d5878f1f2dfdf5e1fb8", false);
		} catch (MultichainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out
				.println("Result Block(0074ba967e7f7c3b04ed0429b796900136d82b52ecf44d5878f1f2dfdf5e1fb8) (default verbose=false) :"
						+ result);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("--- Start of AddressCommandTest ---");

		// BlockChain TestCommand has to be created and started before
		multiChainCommand = new MultiChainCommand(
				"192.168.0.168",
				"7703",
				"hyun",
				"mt393939");

		testgetBlock();

		System.out.println("--- End of AddressCommandTest ---");
	}

}
