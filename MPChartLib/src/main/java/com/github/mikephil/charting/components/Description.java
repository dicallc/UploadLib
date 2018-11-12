package com.github.mikephil.charting.components;

import android.graphics.Paint;

import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;

/**
 * Created by Philipp Jahoda on 17/09/16.
 */
public class Description extends ComponentBase {
    private boolean showMaline;
    private String ma5;
    private String ma10;
    private String ma30;

    public String getMa5() {
        return ma5;
    }

    public void setMa5(String mMa5) {
        ma5 = mMa5;
    }

    public String getMa10() {
        return ma10;
    }

    public void setMa10(String mMa10) {
        ma10 = mMa10;
    }

    public String getMa30() {
        return ma30;
    }

    public void setMa30(String mMa30) {
        ma30 = mMa30;
    }

    public void showMaLine(boolean show){
        this.showMaline=show;
    }

    public boolean getShowMaline() {
        return showMaline;
    }

    /**
     * the text used in the description
     */
    private String text = "Description Label";

    /**
     * the custom position of the description text
     */
    private MPPointF mPosition;

    /**
     * the alignment of the description text
     */
    private Paint.Align mTextAlign = Paint.Align.RIGHT;
    private CharSequence charSequenceText="Description Label";

    public Description() {
        super();
        mTextSize = Utils.convertDpToPixel(8f);
    }

    /**
     * Sets the text to be shown as the description.
     * Never set this to null as this will cause nullpointer exception when drawing with Android Canvas.
     *
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }
    public void setCharSequenceText(CharSequence text) {
        this.charSequenceText = text;
    }
    public CharSequence getCharSequenceText() {
        return charSequenceText;
    }

    /**
     * Returns the description text.
     *
     * @return
     */
    public String getText() {
        return text;
    }

    /**
     * Sets a custom position for the description text in pixels on the screen.
     *
     * @param x - xcoordinate
     * @param y - ycoordinate
     */
    public void setPosition(float x, float y) {
        if (mPosition == null) {
            mPosition = MPPointF.getInstance(x, y);
        } else {
            mPosition.x = x;
            mPosition.y = y;
        }
    }

    /**
     * Returns the customized position of the description, or null if none set.
     *
     * @return
     */
    public MPPointF getPosition() {
        return mPosition;
    }

    /**
     * Sets the text alignment of the description text. Default RIGHT.
     *
     * @param align
     */
    public void setTextAlign(Paint.Align align) {
        this.mTextAlign = align;
    }

    /**
     * Returns the text alignment of the description.
     *
     * @return
     */
    public Paint.Align getTextAlign() {
        return mTextAlign;
    }
}
