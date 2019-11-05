name := "flink-tutorial"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies ++= {
  val flinkVersion = "1.9.0"
  Seq(
    "org.apache.flink" %% "flink-scala" % flinkVersion
    ,"org.apache.flink" %% "flink-clients" % flinkVersion
    ,"org.apache.flink" %% "flink-streaming-scala" % flinkVersion
  )
}