package com.demo.tdd.services;

public class ModServiceImpl implements ModService {
	@Override
	public int mod(int a, int b) {
		if (b == 0) {
			return 0;
		}
		return a % b;
	}
}
