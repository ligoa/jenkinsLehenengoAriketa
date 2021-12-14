package examRecu;


import static org.junit.Assert.assertEquals;

import org.easymock.EasyMock;
import org.easymock.EasyMockSupport;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;
import org.junit.Assert.*;

public class testExamMock extends EasyMockSupport{
	//Choose the best option for this exercise
	//mock(), createNiceMock(), createStrictMock(), createMock(), partialMockBuilder().addMockedMethods() 
	examMock exam;
	
	@Before
	public void inicializar() {
		exam = partialMockBuilder(examMock.class).addMockedMethods("multiply","divide").createMock();
	}
	
	@Test
	public void testear() {
		
		EasyMock.expect(exam.multiply(4.0, 3.14)).andReturn(12.56);
		EasyMock.expect(exam.multiply(12.56, 27)).andReturn(339.12);
		EasyMock.expect(exam.divide(339.12, 3)).andReturn(113.04);
		
		replayAll();
		assertEquals(0,exam.sphereVolume(3),0);
		//assertEquals(113.04,exam.sphereVolume(3));
		verifyAll();
	}
	
}
