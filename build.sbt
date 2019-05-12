name := "scala-tutorial01"

version := "0.1"

scalaVersion := "2.12.8"

val specs2Version = "4.5.1"

libraryDependencies += "org.junit.jupiter" % "junit-jupiter-api" % "5.0.0-RC3" % Test
libraryDependencies += "org.junit.vintage" % "junit-vintage-engine" % "4.12.0-RC3" % Test
libraryDependencies += "org.junit.platform" % "junit-platform-runner" % "1.0.0-RC3" % Test
libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test
libraryDependencies += "org.specs2" %% "specs2-core" % specs2Version % "test"
libraryDependencies += "org.specs2" %% "specs2-matcher-extra" % specs2Version % "test"
libraryDependencies += "org.specs2" %% "specs2-scalacheck" % specs2Version % "test"

scalacOptions in Test ++= Seq("-Yrangepos")