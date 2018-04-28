package com.hanfl.behavior.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.webkit.WebView;

public class CustomActionWebView extends WebView {


    public CustomActionWebView(Context context) {
        super(context);
    }

    public CustomActionWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomActionWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    /**
     *
     * @param actionMode
     * @return
     */
    public ActionMode resolveActionMode(ActionMode actionMode){

        return actionMode;
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return super.startActionMode(callback);
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int type) {
        return super.startActionMode(callback, type);

    }
}
