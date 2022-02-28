package at.ran.games.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.tests.GradientTest;

public class CircleActor implements Actor {

    private MoveStrategy moveStrategy;


    private double x,y; //Gedächnisvariable zum merken wo mann ist

    public CircleActor(MoveStrategy mr) {
        super();
        this.moveStrategy = mr;

    }



    public void update (GameContainer gc, int delta) {
        moveStrategy.update(delta);
    }

    public void render(Graphics graphics){
        graphics.drawOval(this.moveStrategy.getX(),this.moveStrategy.getY(), 20,20);
    }
}
