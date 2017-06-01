package TabuleiroTeste;

import static org.junit.Assert.*;

import org.junit.Test;

import Imoveis.Comercio;
import Imoveis.Hotel;
import Imoveis.PasseVez;
import Imoveis.Start;
import Tabuleiro.Tabuleiro;

public class TabuleiroTest {

	@Test
	public void testCriaListaJogadores() {
		Tabuleiro tab = new Tabuleiro();
		tab.gerarTabuleiro();
		tab.criaListaJogadores();
		assertEquals("Sem jogador",tab.getListaJogadores().get(0).getNome());
		assertEquals("banco",tab.getListaJogadores().get(5).getNome());
		assertEquals("Sem jogador",tab.getListaJogadores().get(8).getNome());
	}

	@Test
	public void testGerarTabuleiro() {
		Tabuleiro tab = new Tabuleiro();
		tab.gerarTabuleiro();
		assertTrue(tab.getListaImoveis().get(0) instanceof Start);
		assertTrue(tab.getListaImoveis().get(1) instanceof Comercio);
		assertTrue(tab.getListaImoveis().get(8) instanceof PasseVez);
		assertTrue(tab.getListaImoveis().get(3) instanceof Hotel);
		
	}


}
