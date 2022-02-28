package at.ran.games.wintergame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

import java.util.ArrayList;
import java.util.List;

public class MainGame  extends BasicGame {

 private List<Actor> actors;

    public MainGame(String title){
      super(title);
      this.actors = new ArrayList<>();
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        //Wird einmal aufgerufen undzwar am beginn des Spieles

        MoveStrategy mr1 = new MoveRight(0,0,0.3f);
        MoveStrategy mr2 = new MoveLeft(500,100,0.1f);
        MoveStrategy mr3 = new MoveLeft(540,200,0.2f);

        CircleActor c1 = new CircleActor(mr1);
        CircleActor c2 = new CircleActor(mr2);

        RectangleActor r1 = new RectangleActor(mr3);

        this.actors.add(c1);
        this.actors.add(c2);
        this.actors.add(r1);

        this.actors.add(new RectActor(300,350));
        this.actors.add(new RectActor(350,400));

        this.actors.add(new OvalActor(450,500));
        this.actors.add(new OvalActor(550,600));



    }



    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        //delta = Zeit seit dem letzten aufruf
        for (Actor actor: this.actors) {
            actor.update(gc,delta);
        }

    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        // gezeichnet
        for (Actor actor : this.actors) {
            actor.render(graphics);
        }

    }

    public static void main(String[] argv) {

        try {
            AppGameContainer container = new AppGameContainer(new MainGame("Wintergame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
