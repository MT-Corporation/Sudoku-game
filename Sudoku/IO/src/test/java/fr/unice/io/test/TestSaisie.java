/**
 * 
 */
package fr.unice.io.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.unice.io.Saisie;

/**
 * @author TRAORE_MOHAMED
 *
 */
class TestSaisie {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testWrite() {
		ArrayList<String> ar = new ArrayList<>();
		ar.add("123456");
		ar.add("346735");
		
		Saisie s = new Saisie();
		
		String saisie ="";
		Scanner sc = new Scanner(System.in);
		saisie = sc.nextLine();
		
		
		
		
		
		s.writeFromArray(ar);
	}

}
