package com.cohort20;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.cohort20.to.Pattern;
import com.cohort20.to.User;

import org.mockito.InjectMocks;
import org.mockito.Mock;


@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {

	@Mock
	private User user;
	
	@Mock
	private Pattern pattern;
	
	@Test
	public void test() {
		User mockedUser = mock(User.class);
		when(mockedUser.getUsername()).thenReturn("Jerry64");
		String username = mockedUser.getUsername();
		verify(mockedUser, times(1)).getUsername();
		
	}
}
