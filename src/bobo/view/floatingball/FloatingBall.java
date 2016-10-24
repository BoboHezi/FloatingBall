package bobo.view.floatingball;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class FloatingBall extends View {

	Paint paint;
	private float cx;
	private float cy;
	private int radius = 50;

	public FloatingBall(Context context) {
		super(context);

		paint = new Paint();
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);

		if (cx != 0 && cy != 0) {

			paint.setColor(0x9920dde9);
			canvas.drawCircle(cx, cy, radius, paint);
		}

	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {

		cx = event.getX();
		cy = event.getY();
		
		Log.i("----------", "TOUCH");
		return super.onTouchEvent(event);
	}

}
