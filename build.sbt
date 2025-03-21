lazy val root =
  project
    .in(file("."))
    .settings(
      name         := "scala3-template",
      version      := "0.1.0-SNAPSHOT",
      organization := "org",
      scalaVersion := "3.6.4",
      libraryDependencies ++=
        Modules.ForCompile :::
          Modules.ForTest :::
          Nil
    )
