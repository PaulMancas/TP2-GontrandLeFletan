package ca.qc.bdeb.sim.tp2gontrandlefletan;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Gontrand extends ObjetDuJeu{
    private double pointsDeVie;
    private ImageView imageView;

    public Gontrand(double tailleX, double tailleY,
                      double positionX, double positionY,
                      double velociteX, double velociteY,
                      double accelerationX, double accelerationY,
                      double pointsDeVie, Image image,
                      Canvas canvas, GraphicsContext graphicsContext)
    {
        super(tailleX,tailleY,positionX,positionY,velociteX,velociteY,accelerationX,accelerationY,canvas,graphicsContext);
        this.pointsDeVie = pointsDeVie;
        this.imageView = new ImageView(image);
    }
}
