/**
 * Subclass of the abstract ABPlayer class which renders simple melodies by binding A and B each to a simple locomotive sequence.
 */
package players;

import composer.SComposer;

public class ABPlayerLocomotion extends ABPlayer {
    /**
     * Create a specialization of an ABPlayer which renders simple melodic melodies by gluing together simple locomotive fragments.
     */

    public ABPlayerLocomotion(SComposer composer){
        super(composer);
    }

    /**
     * Play a simple 4 locomotive sequence
     */

    public void thingA(){
        composer.s2(); composer.mms_87_StaggerUpDown(); composer.x2();
    }

    /**
     * Play a simple 4 locomotive sequence
     */

    public void thingB(){
        composer.s2(); composer.mms_85_StrollDown(); composer.x2();
    }
}
