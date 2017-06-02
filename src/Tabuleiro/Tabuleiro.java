package Tabuleiro;

import java.io.File;
import java.util.ArrayList;

import Imoveis.*;
import Jogadores.Jogador;
import ManipulacaoArquivo.LerArquivo;
/**
 * 
 * @author Ariane e Jean
 * A classe Tabuleiro como nome proprio diz representa o 
 * tabuleiro do jogo. O atributo tamanho refere-se ao tamanho do tabuleiro
 * Os arrayLists de Imovel e de Jogador representam respectivamente
 * a lista de imoveis presentes em cada posi��o e a lista de jogadores que
 * s�o propriet�rios de cada imovel
 *
 */
public class Tabuleiro {
	private int tamanho;
	private ArrayList<Imovel> listaImoveis = new ArrayList<Imovel>();
	private ArrayList<Jogador> listaJogadores = new ArrayList<Jogador>();
	
/**
 * Fun�ao que inicializa o ArrayList<Jogador> com o jogador 
 * banco. As unicas posi�oes do tabuleiro que n�o s�o inicializadas
 * com o banco � o Start e o Passe a vez. Esses s�o inicializados Sem Jogador
 */
	public void criaListaJogadores(){
		Jogador banco = new Jogador("banco", 10000000);
		Jogador semJogador = new Jogador("Sem jogador",0);
		this.listaJogadores.add(semJogador);
		for(int i=1 ; i<this.tamanho; i++)
			if(this.listaImoveis.get(i).getNome() != "Passe a vez"){
				this.listaJogadores.add(banco);
			}
			else{
				this.listaJogadores.add(semJogador);
			}
	}
	/**
	 * Fun�ao que gera o tabuleiro de acordo com informa��es presentes 
	 * em um arquivo de texto
	 */
	public void gerarTabuleiro(){
		File file = new File("tabuleiro1.txt");
		LerArquivo leitura = new LerArquivo(file, 1);
		int posicao;
		this.tamanho = Integer.parseInt(leitura.getDadosArquivo().get(0).get(0));
		
		for (int i = 1; i <leitura.getDadosArquivo().size(); i++) {
			for (int j = 2; j < leitura.getDadosArquivo().get(i).size(); j++) {
				if(j == 2){
					
					posicao = Integer.parseInt(leitura.getDadosArquivo().get(i).get(j-1));
					if(Integer.parseInt(leitura.getDadosArquivo().get(i).get(j)) == 1){
						Start start = new Start();
						listaImoveis.add(posicao-1, start);
					}
					else if(Integer.parseInt(leitura.getDadosArquivo().get(i).get(j)) == 2){
						PasseVez passe = new PasseVez();
						listaImoveis.add(posicao-1, passe);						
					}
					else if(Integer.parseInt(leitura.getDadosArquivo().get(i).get(j)) == 3){
						j++;
						if(Integer.parseInt(leitura.getDadosArquivo().get(i).get(j)) == 1){
							Residencia res = new Residencia();
							j++;							
							res.setValor(Integer.parseInt(leitura.getDadosArquivo().get(i).get(j)));
							j++;
							res.setTaxa(res.getValor()*((double)(Integer.parseInt(leitura.getDadosArquivo().get(i).get(j)))/100));
							listaImoveis.add(posicao-1, res);
						}else if(Integer.parseInt(leitura.getDadosArquivo().get(i).get(j)) == 2){
							Comercio com = new Comercio();
							j++;
							com.setValor(Integer.parseInt(leitura.getDadosArquivo().get(i).get(j)));
							j++;
							com.setTaxa(com.getValor()*((double)(Integer.parseInt(leitura.getDadosArquivo().get(i).get(j)))/100));
							listaImoveis.add(posicao-1, com);
						}else if(Integer.parseInt(leitura.getDadosArquivo().get(i).get(j)) == 3){
							Industria ind = new Industria();
							j++;
							ind.setValor(Integer.parseInt(leitura.getDadosArquivo().get(i).get(j)));
							j++;
							ind.setTaxa(ind.getValor()*((double)(Integer.parseInt(leitura.getDadosArquivo().get(i).get(j)))/100));
							listaImoveis.add(posicao-1, ind);
						}else if(Integer.parseInt(leitura.getDadosArquivo().get(i).get(j)) == 4){
							Hotel hot = new Hotel();
							j++;
							hot.setValor(Integer.parseInt(leitura.getDadosArquivo().get(i).get(j)));
							j++;
							hot.setTaxa(hot.getValor()*(((double)Integer.parseInt(leitura.getDadosArquivo().get(i).get(j)))/100));
							listaImoveis.add(posicao-1, hot);
						}else if(Integer.parseInt(leitura.getDadosArquivo().get(i).get(j)) == 5){
							Hospital hos = new Hospital();
							j++;
							hos.setValor(Integer.parseInt(leitura.getDadosArquivo().get(i).get(j)));
							j++;
							hos.setTaxa(hos.getValor()*((double)(Integer.parseInt(leitura.getDadosArquivo().get(i).get(j)))/100));
							listaImoveis.add(posicao-1, hos);
						}
					}
					
				}
				
			}
		}
			
			
			
	}

	public int getTamanho() {
		return tamanho;
	}


	public ArrayList<Imovel> getListaImoveis() {
		return listaImoveis;
	}

	
	public ArrayList<Jogador> getListaJogadores() {
		return listaJogadores;
	}

	public void setListaJogadores(Jogador jog) {
		this.listaJogadores.set(jog.getPosicao(), jog);
	}
	
	public void setListaJogadores(ArrayList<Jogador> listaJogadores) {
		this.listaJogadores = listaJogadores;
	}
	/**
	 * Fun��o que imprime o tabuleiro completo
	 */
	public void imprimeTabuleiro(){
		int i;
		
		for(i = 0; i < this.tamanho; i++){
			System.out.println("Posicao: " +(i+1) +" Imovel: " + listaImoveis.get(i).getNome() + " Taxa: " + listaImoveis.get(i).getTaxa()
					+ " Valor: " + listaImoveis.get(i).getValor() + " Dono " + listaJogadores.get(i));
		}
	}
}
