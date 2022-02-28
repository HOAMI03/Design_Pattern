package at.ran.games.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class RectangleActor implements Actor {

    private MoveStrategy moveStrategy;


    private double x,y; //Gedächnisvariable zum merken wo mann ist

    public RectangleActor(MoveStrategy mr) {
        super();
        this.moveStrategy = mr;

    }



    public void update (GameContainer gc, int delta) {
        moveStrategy.update(delta);
    }

    public void render(Graphics graphics){
        graphics.drawRect(this.moveStrategy.getX(),this.moveStrategy.getY(), 20,20);
    }
}
