package JogoTeste;

import static org.junit.Assert.*;

import org.junit.Test;

import Imoveis.Hotel;
import Imoveis.Industria;
import Imoveis.Residencia;
import Jogo.Jogo;
/**
 * 
 * @author Ariane e Jean
 * Obs: Os testes que necessitam verificar um double n�o ser�o feitos
 * porque o Eclipse est� informando que o metodo Assert para double est�
 * descontinuada ocasionando erros e atrapalahndo testar outros metodos.
 * Os testes que necessitam da utiliza��o de dados orindos de arquivo
 * forma testados de acordo com os arquivos que estao no diretorio
 *
 */

public class JogoTest {

	@Test
	public void testNovoJogo() {
		Jogo jog = new Jogo();
		jog.novoJogo();
		assertEquals(jog.getJogadores_().get(1).getPosicao(), 3);
		assertEquals(jog.getJogadores_().get(0).getVoltas(), 1);
		assertTrue(jog.getJogadores_().get(2).getImoveis().get(0) instanceof Industria);
		assertTrue(jog.getJogadores_().get(1).getImoveis().get(0) instanceof Hotel);
		assertTrue(jog.getJogadores_().get(0).getImoveis().get(0) instanceof Residencia);
	}
}
