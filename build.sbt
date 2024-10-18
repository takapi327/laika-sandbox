import laika.helium.Helium
import laika.helium.config.*
import laika.ast.Path.Root

ThisBuild / scalaVersion := "3.5.1"

lazy val root = (project in file("."))
  .settings(
    name := "sandbox",
    laikaTheme := Helium.defaults.site
      .topNavigationBar(
        homeLink = IconLink.internal(Root / "index.md", HeliumIcon.home)
      )
      .build
  )
  .enablePlugins(LaikaPlugin)
