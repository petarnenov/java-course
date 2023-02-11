import org.junit.Test;

public class ProblemsTest {
    @Test
    public void p58_1() {
        assert Problems.p58("Hello World") == 5;
    }

    @Test
    public void p58_2() {
        assert Problems.p58("   fly me   to   the moon  ") == 4;
    }

    @Test
    public void p58_3() {
        assert Problems.p58("luffy is still joyboy") == 6;
    }

    @Test
    public void p242_1() {
        assert Problems.p242("anagram", "nagaram") == true;
    }

    @Test
    public void p242_2() {
        assert Problems.p242("car", "rat") == false;
    }

    @Test
    public void p168_1() {
        assert Problems.p168(1).compareTo("A") == 0;
    }

    @Test
    public void p168_2() {
        assert Problems.p168(27).compareTo("AA") == 0;
    }

    @Test
    public void p168_3() {
        assert Problems.p168(28).compareTo("AB") == 0;
    }

    @Test
    public void p168_4() {
        assert Problems.p168(701).compareTo("ZY") == 0;
    }

    @Test
    public void p177_1() {
        assert Problems.p177("42") == 42;
    }

    @Test
    public void p177_2() {
        int result = Problems.p177("00000-12a2a3");
        assert Problems.p177("00000-12a2a3") == 0;
    }

    @Test
    public void p177_3() {
        assert Problems.p177("     -42") == -42;
    }

    @Test
    public void p177_4() {
        assert Problems.p177("4193 erwer erer") == 4193;
    }

    @Test
    public void p177_5() {
        assert Problems.p177("-91283472332") == -2147483648;
    }

    @Test
    public void p177_6() {
        assert Problems.p177("18446744073709551617") == 2147483647;
    }
}
