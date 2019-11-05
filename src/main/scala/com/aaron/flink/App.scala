//https://www.twblogs.net/a/5bbd2a772b71776bd30be248
//https://github.com/phatak-dev/flink-examples/tree/master/src/main/scala/com/madhukaraphatak/flink/streaming/examples
package com.aaron.flink

import org.apache.flink.api.scala.{ExecutionEnvironment, _}

object App {
  def main(args: Array[String]): Unit = {
    val env = ExecutionEnvironment.getExecutionEnvironment

    val data = List("hi","how are you","hi")

    val dataSet = env.fromCollection(data)

    val words = dataSet.flatMap(value => value.split("\\s+"))

    val mappedWords = words.map(value => (value,1))

    val grouped = mappedWords.groupBy(0)

    val sum = grouped.sum(1)

    println(sum.collect())
  }
}
