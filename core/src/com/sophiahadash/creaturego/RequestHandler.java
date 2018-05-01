package com.sophiahadash.creaturego;

public interface RequestHandler {

    public void addMap(final int x, final int y, final int width, final int height);

    public void removeMap();

    public void updateCamera();

}