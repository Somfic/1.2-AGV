package Behaviour.Distance;

import Behaviour.Behaviour;
import Logger.Logger;
import Logic.DistanceLogic;

public class DistanceBehaviour implements Behaviour {

    private final Logger LOGGER = new Logger(this);

    private final DistanceLogic DISTANCE;

    private float lastDistance = 0;

    public DistanceBehaviour(DistanceLogic distance) {
        this.DISTANCE = distance;
    }

    @Override
    public void initialise() {

    }

    @Override
    public void process() {
        float measuredDistance = this.DISTANCE.getDistance();

        if (measuredDistance != this.lastDistance) {
            this.lastDistance = measuredDistance;

            LOGGER.info(Math.round(measuredDistance) + " cm");
        }
    }

    @Override
    public void reset() {

    }
}
