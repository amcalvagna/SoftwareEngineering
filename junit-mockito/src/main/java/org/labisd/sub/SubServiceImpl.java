package org.labisd.sub;

public class SubServiceImpl implements SubService {

	private RandomGenService randomGenService;

	public SubServiceImpl(RandomGenService randomGenService) {
		this.randomGenService = randomGenService;
	}
	@Override
	public Sub createRandomSub() {
		int a = randomGenService.genRandomNumber();
		int b = randomGenService.genRandomNumber();

		return new Sub(a, b);
	}

}
