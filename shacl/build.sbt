// Code license
licenses := Seq("MIT" -> url("https://opensource.org/licenses/MIT"))

// Scalac options.
scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")
scalacOptions in Test ++= Seq("-Yrangepos")

// Set up the main class.
mainClass in Compile := Some("CreateSHACLFromGoogleDocs")

libraryDependencies ++= {
  Seq(
    // Logging
    "com.typesafe.scala-logging"  %% "scala-logging"          % "3.7.1",
    "ch.qos.logback"              %  "logback-classic"        % "1.2.3",

    // Add support for CSV
    "com.github.tototoshi"        %% "scala-csv"              % "1.3.6"
  )
}
