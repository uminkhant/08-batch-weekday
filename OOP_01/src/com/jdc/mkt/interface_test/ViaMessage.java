package com.jdc.mkt.interface_test;

public class ViaMessage implements Messager{

	@Override
	public void sendMessage() {
		System.out.println("Using via message !");
	}

}
