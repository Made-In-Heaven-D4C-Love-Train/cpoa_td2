package cpoa_td3;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import junit.framework.*;
import objMetier.Client;
import cpoa_td3.Normalisation;

public class NormalisationTest{

    @Test
    public void testNormpays() {
        assertEquals("Belgique",Normalisation.Normpays("Belgium"));
    }

    @Test
    public void testNormpays2() {
        assertEquals("France",Normalisation.Normpays("france"));
    }
    @Test
    public void testNormcodepost() {
        assertEquals("05732",Normalisation.Normcodepost("5732"));
    }
    @Test
    public void testNormcodepost2() {
        assertEquals("39567",Normalisation.Normcodepost("TR-39567"));
    }
    @Test
    public void testNormville() {
        assertEquals("Montigny-lès-Metz",Normalisation.Normville("montigny les metz"));
    }
    @Test
    public void testNormville2() {
        assertEquals("Bled",Normalisation.Normville("bled "));
    }
    @Test
    public void testNormville3() {
        assertEquals("Saint-Julien-lès-Metz",Normalisation.Normville("st julien les metz "));
    }
    @Test
    public void testNormville4() {
        assertEquals("Airon-Notre-Dame",Normalisation.Normville("airon notre dame "));
    }
    @Test
    public void testNormville5() {
        assertEquals("Avignon-lès-Saint-Claude",Normalisation.Normville("avignon les st claude "));
    }
    @Test
    public void testNormvoie() {
        assertEquals("1, rue des alouettes",Normalisation.Normvoie("1 rue des alouettes "));
    }
    @Test
    public void testNormvoie2() {
        assertEquals("2, avenue des alouettes",Normalisation.Normvoie("2 av. des alouettes "));
    }
    @Test
    public void testNormvoie3() {
        assertEquals("3, boulevard des alouettes",Normalisation.Normvoie("3 boul. des alouettes "));
    }
    @Test
    public void testNormvoie4() {
        assertEquals("4, place des alouettes",Normalisation.Normvoie("4 pl. des alouettes "));
    }
    @Test
    public void testNormvoie5() {
        assertEquals("5, faubourg des alouettes",Normalisation.Normvoie("5 fg des alouettes "));
    }
}