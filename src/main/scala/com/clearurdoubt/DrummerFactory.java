interface MusicianFactory {
    /**
     * Creates a Musician
     * @return created Musician
     */
    Musician createMusician();
}

interface Instrument {
    /**
     * Plays the Instrument
     * @return the instrument's sound
     */
    String play();
}

public class DrummerFactory implements MusicianFactory {
    public static void main(String[] args) {}

    @Override
    public Musician createMusician() {
        return new Musician(new Drum());
    }
}

class Drum implements Instrument {

    @Override
    public String play() {
        return "Bang!";
    }
}

class Musician {
    private Instrument instrument;
    private boolean isPlaying= false;
    public Musician(Instrument instrument) {
        this.instrument = instrument;
    }

    /**
     * Play the Musician's instrument
     * @return The sound of the Musician's instrument
     * @throws Exception
     */
    public String playInstrument() throws Exception {
        if(isPlaying) throw new IllegalStateException("Musicians can not play music if they are already playing music.");
        else{
            isPlaying = true;
            return this.instrument.play();
        }


    }
}