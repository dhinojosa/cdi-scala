package com.evolutionnext.cdiscala.parameterizedtypes

import javax.enterprise.inject.Produces
import javax.inject.{Named, Inject}
import javax.management.remote.rmi._RMIConnection_Stub
import javax.enterprise.context.{Dependent, RequestScoped}

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 6/21/11
 * Time: 7:58 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */
//@RequestScoped
@Named
@Dependent
class ParameterizedTypeCheck[B >: NewWave <: Alternative] {
  private var rocks:Seq[Rock] = _
  private var jazzes:Seq[Jazz] = _
  private var alternativeSubtypesWithNoGrunge:Seq[B] = _

  @Inject def setListOfRock(rocks:List[Rock]) { this.rocks = rocks}
  def getListOfRock = this.rocks

  @Inject def setListOfJazz(jazzes:List[Jazz]) { this.jazzes = jazzes}
  def getListOfJazz = this.jazzes

  @Inject def setListOfAlternativeSubtypesWithNoGrunge(alternativeSubtypesWithNoGrunge:List[B]) {
    this.alternativeSubtypesWithNoGrunge = alternativeSubtypesWithNoGrunge
  }
  def getListOfAlternativeSubtypesWithNoGrunge = this.alternativeSubtypesWithNoGrunge
}

trait Music
class Jazz extends Music
class Rock extends Music
trait Alternative extends Music
class Punk extends Alternative
class NewWave extends Punk
class Grunge extends NewWave
class Fusion extends Jazz
class HeavyMetal extends Rock
class HairMetal extends HeavyMetal
class SpeedMetal extends HeavyMetal
class DeathMetal extends SpeedMetal


@RequestScoped
class ParameterizedTypesFactory {
   @Produces def createListOfRock() = List(new Rock, new Rock)
   @Produces def createListOfJazz() = List[Jazz](new Jazz, new Fusion)
   @Produces def createListOfAlternativeSubtypesWithNoGrunge() = List[Alternative](new NewWave, new Punk, new Grunge)
}