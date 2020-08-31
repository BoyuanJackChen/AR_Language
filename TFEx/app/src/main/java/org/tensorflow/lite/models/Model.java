package org.tensorflow.lite.models;

public class Model {
    private String content;
    private float x;
    private float y;
    private int clr;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getClr() {
        return clr;
    }

    public void setClr(int clr) {
        this.clr = clr;
    }
}
