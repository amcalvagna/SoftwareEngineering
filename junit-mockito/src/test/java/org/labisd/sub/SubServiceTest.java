package org.labisd.sub;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.mockito.BDDMockito.*;

public class SubServiceTest {
	@Mock 
	private RandomGenService randomGenService;	
	
	@Before
	public void setUp() throws Exception {		
		initMocks(this);	
	}

	@Test 
	public void testCreateRandomMul() {		
		// given (mocked random generator will return 555, then 333)
		given(randomGenService.genRandomNumber()).willReturn(555, 333);
		
		// when
		SubService subService = new SubServiceImpl(randomGenService);
		Sub sub = subService.createRandomSub();
		
		// then
		assertThat(sub.getA()).isEqualTo(555);
		assertThat(sub.getB()).isEqualTo(333);
		assertThat(sub.getResult()).isEqualTo(222);
	}}
