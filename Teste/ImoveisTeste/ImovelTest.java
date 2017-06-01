package ImoveisTeste;

import static org.junit.Assert.*;

import org.junit.Test;

import Imoveis.Imovel;
/**
 * 
 * @author Ariane e Jean
 * Obs: Os testes que necessitam verificar um double n�o ser�o feitos
 * porque o Eclipse est� informando que o metodo Assert para double est�
 * descontinuada ocasionando erros e atrapalahndo testar outros metodos.
 *
 */
public class ImovelTest {

	@Test
	public void testSetNome() {
		Imovel imovel = new Imovel();
		imovel.setNome("Residencia");
		assertEquals("Residencia", imovel.getNome());
	}

}
