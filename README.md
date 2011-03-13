Case Study: Functional Programming in Scala with CDI
====================================================

Intro
-----

This presentation is a case study on the compatibility strength of merging the Scala programming language with CDI (JSR 299: Contexts and Dependency Injection for the Java EE platform [http://jcp.org/en/jsr/detail?id=299]).  CDI is a Dependency Injection framework that is inspired by the Seam, Spring, and Guice frameworks.  It integrates with technologies like JavaServer Faces (JSF) 2.0, Enterprise Java Beans (EJB) 3.1, the Java Persistence API (JPA) 2.0 and JAX-RS (Java API for RESTful Web Services) 1.1 and does so in a type-safe manner.  Scala and other functional programming languages depend heavily on type safety.  It is because of CDI’s type safety that this presentation will be valuable.  Goals for this presentation are to answer and demonstrate the following questions in an unbiased way:

* How purely functional can you operate in CDI?
* Can you inject reuseable functions with ease in CDI?
* Is there hindrance in using Scala with Mojarra JSF and AJAX frameworks?
* Do functional design patterns work in the CDI environment?
* How does Dependency Injection in Scala + CDI compare with Scala’s Cake Pattern?
* How does Scala + CDI + JSF compare with Scala Web Frameworks like Lift?
* How does Scala + CDI + JAX-RS  + JMS  compare with Scala messaging frameworks like AKKA?
* Can integration and acceptance testing in Scala + CDI + Arquillian be used with popular Scala testing frameworks like ScalaTest, Specs, and ScalaCheck?
* Can a CDI implementation work with SBT (Simple Build Tool) and how will it compare to Maven?
* Do Scala structures like implicit work in CDI?

Requirements
------------

* [JDK 1.6.0](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Scala 2.8.1](http://www.scala-lang.org/downloads)
* [sbt](http://code.google.com/p/simple-build-tool/) 
* [Glassfish](http://glassfish.java.net/)
* [Jboss Application Server](http://www.jboss.org/jbossas/)
* [Git](http://http://git-scm.com/)

Setup
-----
Clone repository from this [repository](https://github.com/dhinojosa/cdi-scala) or fork:

`
% git clone git@github.com:dhinojosa/cdi-scala.git cdi-scala
% cd cdi-scala
`

