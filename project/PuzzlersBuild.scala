import sbt._
import sbt.Keys._

object PuzzlersBuild extends Build {

  lazy val puzzlers = Project(
    id = "puzzlers",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "puzzlers",
      organization := "org.example",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.2",
      libraryDependencies ++= Seq(
        "org.scalatest" %% "scalatest" % "1.9.2" % "test"
      )
    )
  )
}
