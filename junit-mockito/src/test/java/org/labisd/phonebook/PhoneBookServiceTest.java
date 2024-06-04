package org.labisd.phonebook;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

public class PhoneBookServiceTest {
	@Mock
	private PhoneBookRegistry registry;
	
	PhoneBookService service;
	@Before
	public void setUp() {
		initMocks(this);
		service = new PhoneBookService(registry);
	} 

	@Test
	public void testRegister_withoutBDD() {
		String name = "Andrea", number = "123456";
		
		when(registry.contains(name)).thenReturn(false);
		service.register(name, number);
		verify(registry).insert(name, number);	
	}
	
	@Test
	public void testRegister_withBDD() {
		String name = "Andrea", number = "123456";
		// given
		given(registry.contains(name)).willReturn(false);
		// when
		service.register(name, number);
		// then
		then(registry).should().insert(name, number);
	}

}
