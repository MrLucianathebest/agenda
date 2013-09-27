package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import agenda.PessoaFisica;

public class PessoaFisicaTest {

	PessoaFisica umCliente;
	
	@Before
	public void setUp() throws Exception {
		umCliente = new PessoaFisica("Moreira", "001.666.456-56", "Unier", "Gerente", "21/01/1950", "img.jpeg");
	}

	@Test
	public void testGetAniversario() {
		assertEquals("21/01/1950", umCliente.getAniversario());
	}

	@Test
	public void testSetAniversario() {
		umCliente.setAniversario("01/01/2000");
		assertEquals(umCliente.getAniversario(),"01/01/2000");
		
	}

	@Test
	public void testGetCargo() {
		assertEquals(umCliente.getCargo(), "Gerente");
	}

	@Test
	public void testSetCargo() {
		umCliente.setCargo("Atendente");
		assertEquals(umCliente.getCargo(),"Atendente");
	}

	@Test
	public void testGetEmpresa() {
		assertEquals("Unier", umCliente.getEmpresa());
	}

	@Test
	public void testSetEmpresa() {
		umCliente.setEmpresa("SINA");
		assertEquals(umCliente.getEmpresa(),"SINA");
	}

	@Test
	public void testGetFoto() {
		assertEquals("img.jpeg", umCliente.getFoto());
	}

	@Test
	public void testSetFoto() {
		umCliente.setFoto("foto.jpeg");
		assertEquals(umCliente.getFoto(),"foto.jpeg");
	}

	@Test
	public void testGetSobrenome() {
		assertEquals("Moreira", umCliente.getSobrenome());
	}

	@Test
	public void testSetSobrenome() {
		umCliente.setSobrenome("Silva");
		assertEquals(umCliente.getSobrenome(),"Silva");
	}

	@Test
	public void testGetCpf() {
		assertEquals("001.666.456-56", umCliente.getCpf());
	}

	@Test
	public void testSetCpf() {
		umCliente.setCpf("001.001.001-00");
		assertEquals(umCliente.getCpf(),"001.001.001-00");
	}

}
