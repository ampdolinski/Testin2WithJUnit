package pl.sda.zadanie.test;

import org.junit.Assert;
import org.junit.Test;
import pl.sda.zadanie.NarzedziaTekstowe;

public class NarzedziaTekstoweTest {
    @Test
    public void zamienTestNaTEST(){
        Assert.assertEquals("TEST", NarzedziaTekstowe.zamienNaDuzeZnaki("Test"));
    }

    @Test
    public void zamienjUnitNatinUj(){
        Assert.assertEquals("tinUj", NarzedziaTekstowe.odwrocString("jUnit"));
    }

    @Test
    public void zwielokrotnijTeksttest3Razy(){
        Assert.assertEquals("test test test ", NarzedziaTekstowe.zwielokrotnijString("test", 3));
    }

}
