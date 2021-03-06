package com.appbestsmile.voicelikeme.theme;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;

public class ThemedToolbar extends Toolbar implements Themed {
  public ThemedToolbar(Context context) {
    this(context, null);
  }

  public ThemedToolbar(Context context, @Nullable AttributeSet attrs) {
    this(context, attrs, 0);
  }

  public ThemedToolbar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  public void refreshTheme(ThemeHelper themeHelper) {
    setBackgroundColor(themeHelper.getPrimaryColor());
  }
}
