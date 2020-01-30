/**
 * Subclass of the abstract ABPlayer class which renders minuet like melodies by binding A and B each to a 3 beat sequence lifted from a Bach minuet
 */
package players;

import composer.SComposer;

public class ABPlayerBach extends ABPlayer {
    /**
     * create a specialization of an ABPlayer which renders a minuet like melody by sequencing fragments stolen from Bach minuets.
     */

    /**
     * Play a 5 note 3 beat sequence lifted from a Bach minuet
     */
    public ABPlayerBach(SComposer composer){
        super(composer);
    }

    public void thingA(){
        composer.mms_35_JSB_M9();
    }
    /**
     * play a 4 note 3 beat sequence lifted from a Bach minuet
     */
    public void thingB(){
        composer.mms_34_JSB_M7();
    }
}
