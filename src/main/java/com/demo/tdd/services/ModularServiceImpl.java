package com.demo.tdd.services;

public class ModularServiceImpl implements ModularService {
	@Override
	public int modular(int a, int b) {
		return b % a;
	}
}
