package com.pps.usmovie.mobile.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * 一直处于跑马灯效果
 * @author zhangxiaole
 *
 */
public class AlwaysMarqueeTextView extends TextView {

	public AlwaysMarqueeTextView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public AlwaysMarqueeTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public AlwaysMarqueeTextView(Context context, AttributeSet attrs,
			int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	public boolean isFocused() {
		return true;
	}
}
