package at.ran.games.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.tests.GradientTest;

public class RectActor implements Actor {




        private double x,y; //Gedächnisvariable zum merken wo mann ist

        public RectActor(double x, double y) {
            super();
            this.x = x;
            this.y = y;
        }

        public void update (GameContainer gc, int delta) {
            this.x++;
        }

        public void render(Graphics graphics){
            graphics.drawRect((float)this.x, (float)this.y, 20,20);
        }
    }


