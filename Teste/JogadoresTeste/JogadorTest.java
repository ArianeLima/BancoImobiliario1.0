package JogadoresTeste;

import static org.junit.Assert.*;

import org.junit.Test;

import Imoveis.Residencia;
import Jogadores.GerarJogadores;
import Jogadores.Jogador;
/**
 * 
 * @author Ariane e Jean
 * Obs: Os teste que necessitam verificar um double estão comentadas
 * porque o Eclipse está informando que o metodo Assert para double está
 * descontinuada ocasionando erros.
 *
 */
public class JogadorTest {

	@Test
	public void Jogador() {
		Jogador jogBanco = new Jogador("banco", 100);
		Jogador jogNormal = new Jogador("Jose Maria", 3000.00);
		assertEquals("banco", jogBanco.getNome());
		//assertEquals(1000000000, jogBanco.getBanco());
		assertEquals("Jose Maria", jogNormal.getNome());
		assertEquals(false, jogNormal.isFaliu());
		//assertEquals(3000.00, jogNormal.getBanco());
		assertEquals(0, jogNormal.getPosicao());
	}

	

	@Test
	public void testSetPosicao() {
		Jogador jogNormal1 = new Jogador("Jose Maria", 3000.00);
		jogNormal1.setPosicao(3);
		assertEquals(3, jogNormal1.getPosicao());
	}

	@Test
	public void testSetImoveis() {
		Jogador jogNormal2 = new Jogador("Jose Maria", 3000.00);
		Residencia res = new Residencia();
		jogNormal2.getImoveis().add(res);
		assertTrue(jogNormal2.getImoveis().get(0) instanceof Residencia);
	}

	

}
