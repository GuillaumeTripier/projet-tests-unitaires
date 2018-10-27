import java.util.ArrayList;

public class Math {

    public int abs(int a) {
        if (a < 0) {
            return -a;
        }
        return a;
    }
    
    public int max(int a, int b) {
    	if(a >= b) {
    		return a;
    	}
        return b;
    }

}
