package ImoveisTeste;

import static org.junit.Assert.*;

import org.junit.Test;

import Imoveis.ClubeSocial;
import Imoveis.Start;

public class StartTest {

	@Test
	public void testStart() {
		Start start = new Start();
		assertEquals("Start", start.getNome());
		assertTrue(start instanceof Start);
	}

}
