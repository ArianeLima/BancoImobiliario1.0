package ImoveisTeste;

import static org.junit.Assert.*;

import org.junit.Test;

import Imoveis.ClubeSocial;

public class ClubeSocialTest {

	@Test
	public void test() {
		ClubeSocial club = new ClubeSocial();
		assertEquals("Clube Social", club.getNome());
		assertTrue(club instanceof ClubeSocial);
	}

}
