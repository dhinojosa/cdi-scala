package com.evolutionnext.cdiscala.temperature

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 6/21/11
 * Time: 11:44 AM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */
class TemperatureConverter {
   def convertToCelsius(f:Double) = (f - 32) * 5 / 9
   def convertToFahrenheit(c:Double) = (c * 9 / 5) + 32
}