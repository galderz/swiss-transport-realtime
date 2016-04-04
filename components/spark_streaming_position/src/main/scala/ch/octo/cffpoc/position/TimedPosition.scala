package ch.octo.cffpoc.position

import ch.octo.cffpoc.models.{ GeoLocBearing, GeoLoc }
import ch.octo.cffpoc.stops.Stop
import org.joda.time.DateTime

/**
 * Created by alex on 01/03/16.
 */

sealed trait HasTimedPosition {
  val timestamp: DateTime
  val position: GeoLocBearing
}

case class TimedPosition(
    timestamp: DateTime,
    position: GeoLocBearing) extends HasTimedPosition {

}

case class TimedPositionIsMoving(
    timestamp: DateTime,
    position: GeoLocBearing,
    moving: Boolean) extends HasTimedPosition {

}

case class TimedPositionWithStop(
    timestamp: DateTime,
    position: GeoLocBearing,
    stop: Option[Stop]) extends HasTimedPosition {
}