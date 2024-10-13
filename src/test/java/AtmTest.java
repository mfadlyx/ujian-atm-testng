import com.juaracoding.Atm;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AtmTest {

    Atm atm;

    @BeforeMethod
    public void setUp(){
        atm = new Atm(1000);
    }

    @Test(priority = 1)
    public void testLihatSaldo() {
        Assert.assertEquals(atm.lihatSaldo(), 1000);
    }

    @Test(priority = 2)
    public void  testSetorUang() {
        atm.setorUang(1000);
        double actual = atm.lihatSaldo();
        double expected = 2000;
        Assert.assertEquals(actual, expected);
    }

    @Test(priority = 3, expectedExceptions = IllegalArgumentException.class)
    public void testSetorUangNegatif() {
        atm.setorUang(-1000);
    }

    @Test(priority = 4)
    public void testTarikUang() {
        atm.tarikUang(500);
        double actual = atm.lihatSaldo();
        double excepted = 500;
        Assert.assertEquals(actual, excepted);
    }

    @Test(priority = 5, expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangLebihDariSaldo(){
        atm.tarikUang(5000);
    }

    @Test(priority = 6, expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangNegatif(){
        atm.tarikUang(-2000);
    }

}
