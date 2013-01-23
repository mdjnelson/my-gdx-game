package lib;

import com.badlogic.gdx.Gdx;

public class Sound {

    public static com.badlogic.gdx.audio.Sound characterBullet1;

    public static void load () {
        characterBullet1 = load("sounds/character_bullet1.mp3");
    }

    private static com.badlogic.gdx.audio.Sound load(String name) {
        return Gdx.audio.newSound(Gdx.files.internal(name));
    }
}