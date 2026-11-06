package ca.qc.bdeb.sim.tp2gontrandlefletan;

import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public abstract class ObjetDuJeu {
    private Point2D taille;
    private Point2D position;
    private Point2D velocite;
    private Point2D acceleration;

    private Canvas canvas;
    private GraphicsContext graphicsContext;

    public ObjetDuJeu(double tailleX, double tailleY,
                      double positionX, double positionY,
                      double velociteX, double velociteY,
                      double accelerationX, double accelerationY,
                      Canvas canvas, GraphicsContext graphicsContext)
    {
        this.taille = new Point2D(tailleX,tailleY);
        this.position = new Point2D(positionX,positionY);
        this.velocite = new Point2D(velociteX,velociteY);
        this.acceleration = new Point2D(accelerationX,accelerationY);
        this.canvas = canvas;
        this.graphicsContext = graphicsContext;
    }


}
