package org.eclipse.fx.ide.fxml.compiler;

public class BitOperations {
	
	public static boolean bitSet(int v, int mask) {
		return (v & mask) == mask;
	}
}
