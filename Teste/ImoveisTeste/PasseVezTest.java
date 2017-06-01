package ImoveisTeste;

import static org.junit.Assert.*;

import org.junit.Test;

import Imoveis.PasseVez;
import Imoveis.Start;

public class PasseVezTest {

	@Test
	public void testPasseVez() {
		PasseVez passe = new PasseVez();
		assertEquals("Passe a vez", passe.getNome());
		assertTrue(passe instanceof PasseVez);
	}

}
