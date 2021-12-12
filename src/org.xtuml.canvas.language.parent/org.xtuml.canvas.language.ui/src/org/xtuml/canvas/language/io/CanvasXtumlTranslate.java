package org.xtuml.canvas.language.io;

public class CanvasXtumlTranslate {

	private CanvasManagement canvasManagement;

	public void initialize() {
		canvasManagement = new CanvasManagement();
	}
	
	public void stop() {
		canvasManagement.shutdown();
	}

	public CanvasManagement getManagement() {
		return canvasManagement;
	}
}
