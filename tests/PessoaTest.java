package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import agenda.Pessoa;

public class PessoaTest {

	Pessoa umaPessoa;
	
	@Before
	public void setUp() throws Exception {
		umaPessoa = new Pessoa("Maria","3333-4444","QC 666 Conj AA Casa 01","maria@email.com","www.sitedamaria.com.br");
	}

	@Test
	public void testGetNome() {
		assertEquals("Maria", umaPessoa.getNome());
	}

	@Test
	public void testGetTelefone() {
		assertEquals("3333-4444", umaPessoa.getTelefone());
	}
	
	@Test
	public void testSetNome() {
		umaPessoa.setNome("Carlos");
		assertEquals(umaPessoa.getNome(), "Carlos");
	}

	@Test
	public void testSetTelefone() {
		umaPessoa.setTelefone("0000-0000");
		assertEquals(umaPessoa.getTelefone(), "0000-0000");
	}

	@Test
	public void testGetEndereco() {
		assertEquals("QC 666 Conj AA Casa 01", umaPessoa.getEndereco());
	}

	@Test
	public void testSetEndereco() {
		umaPessoa.setEndereco("Quadra Conjunto Casa");
		assertEquals(umaPessoa.getEndereco(),"Quadra Conjunto Casa");
	}

	@Test
	public void testGetEmail() {
		assertEquals("maria@email.com", umaPessoa.getEmail());
	}

	@Test
	public void testSetEmail() {
		umaPessoa.setEmail("teste@teste.com");
		assertEquals(umaPessoa.getEmail(), "teste@teste.com");
	}

	@Test
	public void testGetSite() {
		assertEquals("www.sitedamaria.com.br", umaPessoa.getSite());
	}

	@Test
	public void testSetSite() {
		umaPessoa.setSite("www.teste.com.br");
		assertEquals(umaPessoa.getSite(), "www.teste.com.br");
	}

	}
