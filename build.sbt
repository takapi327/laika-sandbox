import laika.helium.Helium
import laika.helium.config.*
import laika.ast.Path.Root
import laika.config.{ Version, Versions }

ThisBuild / scalaVersion := "3.5.1"

val versions = Versions
  .forCurrentVersion(Version("0.2.x", "0.2"))
  .withOlderVersions(Version("0.1.x", "0.1"))

lazy val root = (project in file("."))
  .settings(
    name := "sandbox",
    laikaTheme := Helium.defaults.site
      .topNavigationBar(
        homeLink = IconLink.internal(Root / "index.md", HeliumIcon.home)
      )
      .site
      .versions(versions)
      .build
  )
  .enablePlugins(LaikaPlugin)
