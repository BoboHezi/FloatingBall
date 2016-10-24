package bobo.view.floatingball;

import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        FloatingBall ball = new FloatingBall(getApplicationContext());
        setContentView(ball);
    }

}
