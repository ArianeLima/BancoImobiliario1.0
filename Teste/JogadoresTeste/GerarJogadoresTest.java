package JogadoresTeste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Jogadores.GerarJogadores;
import Jogadores.Jogador;

public class GerarJogadoresTest {

	@Test
	public void testGerarJogadores() {
		GerarJogadores gerar = new GerarJogadores(4,3500.00);
		assertEquals(4,gerar.getQuantidadeJogadores());
		//assertEquals(3500.00,gerar.getValorInicial());
		

	}

	@Test
	public void testCadastraJogadores() {
		GerarJogadores gerar1 = new GerarJogadores(2,500.00);
		ArrayList<Jogador> jogs = new ArrayList<Jogador>();
		jogs = gerar1.cadastraJogadores();
		assertEquals(1, jogs.get(0).getOrdemJogada());
		assertEquals(2, jogs.get(1).getOrdemJogada());
	}

}
