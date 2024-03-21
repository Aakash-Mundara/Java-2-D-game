package objects;

import main.Game;

public class Spike extends GameObject{
    public Spike(int x, int y, int objType) {
        super(x, y, objType);
        initHitbox(32,16);
        xDrawOffset = 0;
        yDrawOffset = (int)(Game.Scale * 10);
        hitbox.y += yDrawOffset;
    }
}
