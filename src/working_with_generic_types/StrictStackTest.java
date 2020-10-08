package working_with_generic_types;
import org.junit.Test;
import static org.junit.Assert.*;

public class StrictStackTest {

    @Test
    public void test(){
        StrictStack<Integer> s = new StrictStack<>();
        s.push(10);
        assertEquals("Test Failed",s.top(), (Integer)10 );
        assertEquals("Test Failed",s.size(), (long)1 );
        s.pop();
        s.push(1000);
        assertEquals("Test Failed",s.top(), (Integer)1000 );
    }

}
