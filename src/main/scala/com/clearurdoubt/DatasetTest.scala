package com.clearurdoubt

import org.apache.spark.sql.SparkSession

object DatasetTest extends App {

  val spark = SparkSession.builder
    .appName("Spark SQL - First App")
    .master("local[*]")
    .getOrCreate()


  val ds = spark.read.textFile("src/main/resources/README.md")
  ds.show(truncate = false)

  val test = true

  val firstLine: String = ds.first
  println("firstLine: " + firstLine)

  val sparkLines = ds.filter(line => line.contains("Spark"))
  sparkLines.show(truncate = false)

  sparkLines.write
    .format("text")
    .save("target/textOutput")

  spark.stop()
}

