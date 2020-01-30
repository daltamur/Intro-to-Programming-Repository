/**
 * Subclass of the Abstract ABPlayer class which renders simple melodies by binding A and B each to a simple 4 beat sequence.
 */

package players;

import composer.SComposer;

public class ABPlayerBasics extends ABPlayer {

    /**
     * Create a specialization of an ABPlayer which renders simple melodic melodies by gluing together simple 4 beat fragments.
     * SComposer named "composer: is the work horse composer.
     */
    public ABPlayerBasics(SComposer composer){
        super(composer);
    }

    /**
     * play a simple 4 beat sequence
     */
    public void thingA(){
        composer.s2();
        composer.mms3();
        composer.x2();
    }

    /**
     * Play another simple 4-beat sequence
     */
    public void thingB(){
        composer.s2(); composer.mms3(); composer.x2();
    }
}
