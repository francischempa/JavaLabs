package working_with_generic_types2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class PrioritizeStackTest {

    @Test
    public void test(){
        PrioritizeStack<Integer> s = new PrioritizeStack<>();
        s.push(10);
        assertEquals("Test Failed",s.top(), (Integer)10 );
        assertEquals("Test Failed",s.size(), (long)1 ); 
        s.pop();
        s.push(1000);
        assertEquals("Test Failed",s.top(), (Integer)1000 );
    }

}
