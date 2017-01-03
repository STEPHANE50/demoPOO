package co.simplon.poo;

	

import static org.junit.Assert.*;

import org.junit.Test;

public class AdresseTest {
	
	@Test
	public void adresses_identiques_en_memoire_sont_equals( ) {
		Adresse adresse1 = new Adresse( 1,"rue des lilas",92100, "Courbevoie");
		Adresse adresse2 = adresse1;
		
		boolean comparaison1 = adresse1.equals(adresse2);
		boolean comparaison2 = adresse2.equals(adresse1);
		
		assertTrue(comparaison1);
		assertTrue(comparaison2);
	}


	@Test
	public void adresses_distinctes_en_memoire_sont_equals() {
		Adresse adresse1 = new Adresse ( 1,"rue des lilas",92100, "Courbevoie");
		Adresse adresse2 = new Adresse ( 1,"rue des lilas",92100, "Courbevoie");
		
		boolean comparaison = adresse1.equals(adresse2);
		
		assertTrue(comparaison);
	}
	
	@Test
	public void si_adresses_differentes_alors__equals_false() {
		Adresse adresse1 = new Adresse ( 1,"rue des lilas",92100, "Courbevoie");
		Adresse adresse2 = new Adresse ( 2,"rue des lilas",92100, "Courbevoie");
		
		boolean comparaison1 = adresse1.equals(adresse2);
		boolean comparaison2 = adresse2.equals(adresse1);
		
		assertFalse(comparaison1);
		assertFalse(comparaison2);
	}
	
	@Test
	public void comparaison_adressse_non__equals_false() {
		Adresse adresse1 = new Adresse ( 1,"rue des lilas",92100, "Courbevoie");
		Adresse adresse2  = null;
		
		boolean comparaison = adresse1.equals(adresse2);
		
		assertFalse(comparaison);
	}
	@Test
	public void adresses_distinctes_en_memoire_sonthashcode_identique() {
		Adresse adresse1 = new Adresse ( 1,"rue des lilas",92100, "Courbevoie");
		Adresse adresse2 = new Adresse ( 1,"rue des lilas",92100, "Courbevoie");
		
		int hashcodeAdresse1 = adresse1.hashCode();
		int hashcodeadresse2 = adresse2.hashCode();
		
		assertEquals(hashcodeAdresse1, hashcodeadresse2);
	}

}


		
