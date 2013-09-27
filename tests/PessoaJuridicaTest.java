package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import agenda.PessoaJuridica;

public class PessoaJuridicaTest {

	PessoaJuridica umaEmpresa;
	
	@Before
	public void setUp() throws Exception {
		umaEmpresa = new PessoaJuridica("CIA SA", "90.123.456/7890-90");
	}

	@Test
	public void testGetCnpj() {
		assertEquals("90.123.456/7890-90", umaEmpresa.getCnpj());
	}

	@Test
	public void testSetCnpj() {
		umaEmpresa.setCnpj("01.000.000/0000-01");
		assertEquals(umaEmpresa.getCnpj(), "01.000.000/0000-01");
	}

	@Test
	public void testGetRazaoSocial() {
		assertEquals("CIA SA", umaEmpresa.getRazaoSocial());
	}

	@Test
	public void testSetRazaoSocial() {
		umaEmpresa.setRazaoSocial("Group SA");
		assertEquals(umaEmpresa.getRazaoSocial(), "Group SA");
	}

}
