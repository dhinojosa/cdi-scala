package com.evolutionnext.cdiscala.dao

import org.scalatest.WordSpec
import org.scalatest.matchers.MustMatchers
import org.easymock.EasyMock.{expect => mexpect, createMock, replay, verify}
import javax.persistence.{Query, EntityManager}
import org.joda.time.DateTime
import com.evolutionnext.cdiscala.account.Account

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 5/18/11
 * Time: 10:14 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */

class TypedFinderTest extends WordSpec with MustMatchers {

  "find" should {
    "use the entityManager to find an element" in {
      val em = createMock(classOf[EntityManager])
      val typedFinder = new TypedFinder(em)

      val account = new Account(13L, "Dan", "Hinojosa", "password")
      mexpect(em.find(classOf[Account], 12L)).andReturn(account)

      replay(em)
      val result = typedFinder.find[Account](12L)
      result.firstName must be("Dan")
      verify(em)
    }
  }

  "resultList" should {
    "use the entityManager to find a list of elements" in {
      import scala.collection.JavaConversions._

      val em = createMock(classOf[EntityManager])
      val query = createMock(classOf[Query])

      val typedFinder = new TypedFinder(em)

      val map = Map("firstName" -> "Dan")

      val expectedResult: java.util.List[Account] = List(
        new Account(13L, "Dan", "Hinojosa", "password"),
        new Account(14L, "Daniel", "Day Lewis", "password"),
        new Account(15L, "Daniel", "Radcliffe", "password")
      )

      val queryString = "SELECT * from nvm_dsa where firstName like :firstName"
      mexpect(em.createQuery(queryString)).andReturn(query)
      mexpect(query.setParameter("firstName", "Dan")).andReturn(query)
      mexpect(query.getResultList.asInstanceOf[java.util.List[Account]]).andReturn(expectedResult)

      replay(em, query)
      val result = typedFinder.resultList(map, queryString)
      result.size must be(3)
      verify(em, query)
    }
  }

  "singleResult" should {
    "find a single result from the entityManager" in {
      val em = createMock(classOf[EntityManager])
      val query = createMock(classOf[Query])

      val typedFinder = new TypedFinder(em)

      val map = Map("firstName" -> "Dan")

      val expectedResult =
        new Account(13L, "Dan", "Hinojosa", "password")

      val queryString = "SELECT * from nvm_dsa where firstName = :firstName"
      mexpect(em.createQuery(queryString)).andReturn(query)
      mexpect(query.setParameter("firstName", "Dan")).andReturn(query)
      mexpect(query.getSingleResult.asInstanceOf[Account]).andReturn(expectedResult)

      replay(em, query)
      val result = typedFinder.singleResult[Account](map, queryString)
      result must be(expectedResult)
      verify(em, query)
    }
  }

  "inferTypes" should {
    "return a string representation of what type is given as a parameter" in {
      val em = createMock(classOf[EntityManager])
      val typedFinder = new TypedFinder(em)
      val paramResults = Map(
          "Boo" -> "String",
          12 -> "Int",
          new DateTime() -> "Object",
          13.asInstanceOf[Short] -> "Short",
          's' -> "Char",
          3233331221L -> "Long",
          3233.33 .toFloat -> "Float",
          3233d -> "Double",
          32.toByte -> "Int"
      )
      paramResults.foreach {case (k,v) =>
         typedFinder.inferType(k) must be (v)
      }
    }
  }
}
