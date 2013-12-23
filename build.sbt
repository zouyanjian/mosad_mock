name := """mosad_mock"""

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  // Select Play modules
  //jdbc,      // The JDBC connection pool and the play.api.db API
  //anorm,     // Scala RDBMS Library
  //javaJdbc,  // Java database API
  //javaEbean, // Java Ebean plugin
  //javaJpa,   // Java JPA plugin
  //filters,   // A set of built-in filters
  javaCore,  // The core Java API
  // WebJars pull in client-side web libraries
  "org.webjars" %% "webjars-play" % "2.2.1",
  "org.webjars" % "bootstrap" % "2.3.1",
  // Add your own project dependencies in the form:
  // "group" % "artifact" % "version"
  "com.google.inject" % "guice" % "3.0",
  "javax.inject" % "javax.inject" % "1" ,
  "org.mockito" % "mockito-core" % "1.9.5" % "test"
)

play.Project.playScalaSettings
