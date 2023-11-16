import sbt.*

object Modules {
  lazy val ForCompile: List[ModuleID] =
    "org.typelevel" %% "cats-core" % "2.9.0" ::
      Nil

  lazy val ForTest: List[ModuleID] =
    "org.scalatest"    %% "scalatest"  % "3.2.17" % Test ::
      "org.scalacheck" %% "scalacheck" % "1.17.0" % Test ::
      Nil
}
